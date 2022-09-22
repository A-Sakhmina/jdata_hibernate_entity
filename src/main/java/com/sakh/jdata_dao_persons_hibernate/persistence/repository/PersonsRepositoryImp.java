package com.sakh.jdata_dao_persons_hibernate.persistence.repository;

import com.sakh.jdata_dao_persons_hibernate.persistence.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonsRepositoryImp implements PersonsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public PersonsRepositoryImp() {
    }

    public PersonsRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Person> getPersonsByCity(String city) {

        Query query = entityManager.createQuery("Select p from Person p where lower(p.cityOfLiving)  like lower(:city)");
        query.setParameter("city", city);
        List<Person> persons = query.getResultList();
        return persons;
    }
}
