package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table (name = "insurance")
public class Insurance {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Integer id;

    @Column (name = "insuranceCompany")
    private String insuranceCompany;

    @OneToOne
    @JoinColumn (name = "insurance_id", referencedColumnName = "id")
    private List<Car> Car;

}
