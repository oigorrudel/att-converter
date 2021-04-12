package br.xksoberbado.attconverterexample.model;

import br.xksoberbado.attconverterexample.converter.GenderConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PEOPLE")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @Convert(converter = GenderConverter.class)
    private Gender gender;

}
