package com.example.peopleinfolist.service;



import com.example.peopleinfolist.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleService {
    private List<Person> peopleList;

    public PeopleService() {
        peopleList = new ArrayList<>();
    }

    public List<Person> getPeopleList() {
        return Collections.unmodifiableList(peopleList);
    }

    public void addPerson(Person person) {
        peopleList.add(person);
    }
}
