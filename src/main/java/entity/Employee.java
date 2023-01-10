package entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "ad")
    private String ad;
    @Column(name = "soyAd")
    private String soyAd;

    @Column(name = "maas")
    private double maas;

    @OneToMany (mappedBy = "car")
    private List<Car> Car;

    @OneToOne(mappedBy = "employee")
    //@Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn (name = "address_id", referencedColumnName = "id")
    private Address address;

}