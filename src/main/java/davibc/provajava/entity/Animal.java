package davibc.provajava.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "animal")
@Table(name = "tb_animal")
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @Column(name = "animal_especie")
    private String especie;

}
