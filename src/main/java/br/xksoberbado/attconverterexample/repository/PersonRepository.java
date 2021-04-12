package br.xksoberbado.attconverterexample.repository;

import br.xksoberbado.attconverterexample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
