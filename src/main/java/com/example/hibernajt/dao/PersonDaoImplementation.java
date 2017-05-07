package com.example.hibernajt.dao;

import com.example.hibernajt.model.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Created by MAKS on 04.05.2017.
 */

@Repository
public class PersonDaoImplementation implements PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void safe(Person person) {
        entityManager.persist(person);
    }
}
