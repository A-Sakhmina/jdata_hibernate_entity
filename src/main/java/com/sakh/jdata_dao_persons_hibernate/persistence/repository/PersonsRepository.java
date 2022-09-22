package com.sakh.jdata_dao_persons_hibernate.persistence.repository;

import com.sakh.jdata_dao_persons_hibernate.persistence.entity.Person;

import java.util.List;

public interface PersonsRepository {
    List<Person> getPersonsByCity(String city);
}
