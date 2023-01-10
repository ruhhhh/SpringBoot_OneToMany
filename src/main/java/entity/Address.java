package entity;
import jakarta.persistence.*;
import lombok.Data;

/**
 * @author hcalpay
 * @Date 25.12.2022
 */
@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "il")
    private String il;
    @Column(name = "ilce")
    private String ilce;
    @Column(name = "sokak")
    private String sokak;
    @Column(name = "cadde")
    private String cadde;
    @Column(name = "kapiNo")
    private Integer kapiNo;
    @Column (name = "postaKodu")
    private Integer postaKodu;
    // Entity sınıfında bulunan bir field'in veritabanında sütun karşılığı olmayacağı anlamına gelmektedir
    @Transient
    private Integer postaKodu2;
    @OneToOne (mappedBy = "address")
    private Employee employee;

}
