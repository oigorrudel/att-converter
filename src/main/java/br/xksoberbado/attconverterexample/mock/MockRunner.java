package br.xksoberbado.attconverterexample.mock;

import br.xksoberbado.attconverterexample.model.PersonDB;
import br.xksoberbado.attconverterexample.repository.PersonDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MockRunner implements ApplicationRunner {

    @Autowired
    private PersonDBRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.save(new PersonDB("João", 'M'));
        repository.save(new PersonDB("Maria", 'F'));
    }
}
