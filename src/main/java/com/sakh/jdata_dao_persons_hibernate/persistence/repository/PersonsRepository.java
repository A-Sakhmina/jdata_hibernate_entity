package com.sakh.jdata_dao_persons_hibernate.persistence.repository;

import com.sakh.jdata_dao_persons_hibernate.persistence.entity.Person;
import com.sakh.jdata_dao_persons_hibernate.persistence.entity.PersonInfo;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Person, PersonInfo> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByPersonInfoAgeLessThanOrderByPersonInfoAgeAsc(int age);

    Optional<Person> findByPersonInfoNameAndPersonInfoSurname(String name, String surname);
}
