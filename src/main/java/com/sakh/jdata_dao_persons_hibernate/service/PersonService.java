package com.sakh.jdata_dao_persons_hibernate.service;

import com.sakh.jdata_dao_persons_hibernate.persistence.repository.PersonsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonsRepository repository;

    public PersonsRepository getRepository() {
        return repository;
    }
}
