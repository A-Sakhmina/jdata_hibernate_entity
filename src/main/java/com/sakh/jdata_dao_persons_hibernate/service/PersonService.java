package com.sakh.jdata_dao_persons_hibernate.service;

import com.sakh.jdata_dao_persons_hibernate.persistence.repository.PersonsRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    PersonsRepository repository;

    PersonService(PersonsRepository personsRepository) {
        this.repository = personsRepository;
    }

    public PersonsRepository getRepository() {
        return repository;
    }
}
