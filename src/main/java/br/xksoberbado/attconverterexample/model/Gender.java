package br.xksoberbado.attconverterexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum Gender {

    MALE('M'),
    FEMALE('F');

    private Character valueDB;

    public static Gender getByValueDB(Character valueDB) {
        return Stream.of(values())
                .filter(g -> g.getValueDB().equals(valueDB))
                .findFirst()
                .orElseThrow(() -> new EnumConstantNotPresentException(Gender.class, valueDB.toString()));
    }
}
