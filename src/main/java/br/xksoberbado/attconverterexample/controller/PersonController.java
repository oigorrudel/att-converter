package br.xksoberbado.attconverterexample.controller;

import br.xksoberbado.attconverterexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("list")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("list-two")
    public ResponseEntity<?> findAll2() {
        return ResponseEntity.ok(service.findAll2());
    }

}
