package br.xksoberbado.attconverterexample.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PEOPLE")
public class PersonDB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Character gender; //F = feminino, M = masculino, etc...

    public PersonDB(String name, Character gender) {
        this.name = name;
        this.gender = gender;
    }
}
