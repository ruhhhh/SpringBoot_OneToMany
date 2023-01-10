package service;

import entity.Address;
import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 * @author hcalpay
 */
public class DenemeService {

    public void ekle(){

        /*Session işlmeleri session almak için*/
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Employee emp = employeDoldur();
        /*save depreciated oldugundan persist() metodu kullanılabilir tranaction olmadıgı için kayıt veriitabanında olmayacak*/
        long id = (Long) session.save(emp);

        System.out.println("1.empolyee transaction olmadan kaddeilmeye çalışıldı");

        /*sessiondan transaction baslatıyor*/
        Transaction tx1 = session.beginTransaction();
        /*Yeni bir session olusturuyor*/
        Session session1 = sessionFactory.openSession();
        Employee emp1 = employeDoldur();
        /*transaction acıldığı için tekrar kayıt etmeye calısıyor*/
        long id1 = (Long) session1.save(emp1);
        tx1.commit();

        /*load metodu yerine get metodu kullanılabilir veri tabanında kayıt cekmeye çalışılıyor*/
        Session session2 = sessionFactory.openSession();
        Transaction tx6 = session2.beginTransaction();
        Employee emp6 =  session2.load(Employee.class, 1L);

        emp6.setAd("Yeni güncel Ad");
        emp6.setMaas(90000);
        emp6.getAddress().setIlce("Yeni Guncel Adres");
        session2.save(emp6);
        emp6.setAd("New Name1"); // will get updated in database
        tx6.commit();
        session1.close();
        session2.close();
       // sessionFactory.close();
    }

    public void sil(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.get(Employee.class,1L);
        Transaction tx = session.beginTransaction();
        Employee emp = session.get(Employee.class,1L);
        session.remove(emp);
        tx.commit();
    }

    public static Employee employeDoldur() {

        Employee emp = new Employee();
        emp.setAd("Deneme Employee");
        emp.setMaas(1000);

        Address add = new Address();
        add.setIlce("Deneme Ilce");
        add.setPostaKodu(121212);
        add.setCadde("cadde");
        add.setKapiNo(1);
        add.setSokak("sokak");

        emp.setAddress(add);

        add.setEmployee(emp);

        return emp;
    }

}
