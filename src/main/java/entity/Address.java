package entity;
import jakarta.persistence.*;
/**
 * @author hcalpay
 * @Date 25.12.2022
 */
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cadde")
    private String cadde;

    @Column(name = "sokak")
    private String sokak;

    @Column(name = "kapiNo")
    private Integer kapiNo;

    private String ilce;

    private String postaKodu;

    @Transient
    private String postaKodu2;

    @OneToOne
    private Employee employee;

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public Integer getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(Integer kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
