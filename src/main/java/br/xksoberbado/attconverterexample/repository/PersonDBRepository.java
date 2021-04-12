package br.xksoberbado.attconverterexample.repository;

import br.xksoberbado.attconverterexample.model.PersonDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDBRepository extends JpaRepository<PersonDB, Long> {
}
