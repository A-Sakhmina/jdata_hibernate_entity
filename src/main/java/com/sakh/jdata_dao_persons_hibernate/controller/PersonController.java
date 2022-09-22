package com.sakh.jdata_dao_persons_hibernate.controller;

import com.sakh.jdata_dao_persons_hibernate.persistence.entity.Person;
import com.sakh.jdata_dao_persons_hibernate.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    PersonService personService;

    PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    List<Person> getPersonsByCity(@RequestParam String city) {
        return personService.getRepository().getPersonsByCity(city);
    }
}
