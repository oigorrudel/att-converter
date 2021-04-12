package br.xksoberbado.attconverterexample.service;

import br.xksoberbado.attconverterexample.model.Person;
import br.xksoberbado.attconverterexample.model.PersonDB;
import br.xksoberbado.attconverterexample.repository.PersonDBRepository;
import br.xksoberbado.attconverterexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonService {

    @Autowired
    private PersonDBRepository repository;

    @Autowired
    private PersonRepository repository2;

    public Collection<PersonDB> findAll() {
        return repository.findAll();
    }

    public Collection<Person> findAll2() {
        return repository2.findAll();
    }
}
