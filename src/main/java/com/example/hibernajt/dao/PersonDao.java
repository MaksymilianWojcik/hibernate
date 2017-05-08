package com.example.hibernajt.dao;

import com.example.hibernajt.model.Person;

import java.util.List;

/**
 * Created by MAKS on 04.05.2017.
 */


public interface PersonDao {

    void safe(Person person);
    List<Person> getAll();
}
