package br.xksoberbado.attconverterexample.converter;

import br.xksoberbado.attconverterexample.model.Gender;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, Character> {

    @Override
    public Character convertToDatabaseColumn(Gender gender) {
        return Objects.nonNull(gender) ? gender.getValueDB() : null;
    }

    @Override
    public Gender convertToEntityAttribute(Character valueDB) {
        return Objects.nonNull(valueDB) ? Gender.getByValueDB(valueDB) : null;
    }
}
