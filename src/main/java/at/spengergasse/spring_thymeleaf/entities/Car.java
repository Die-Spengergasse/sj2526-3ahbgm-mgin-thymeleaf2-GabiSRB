package at.spengergasse.spring_thymeleaf.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="c_car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="c_id")
    private Long id;

    @Column(name="c_brand")
    private String brand;

    @Column(name="c_model")
    private String model;

    @Column(name="c_ps")
    private Integer ps;

    @Column(name="c_construction")
    private LocalDate constructionDate;

}
