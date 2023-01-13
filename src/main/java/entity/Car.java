package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "car")
public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column (name = "id", nullable = false)
    private Integer id;

    @Column (name = "brand")
    private String brand;

    @Column (name = "age")
    private Integer age;

    @ManyToOne
    @JoinColumn (name = "human_id", nullable = false)
    private Human human;



}
