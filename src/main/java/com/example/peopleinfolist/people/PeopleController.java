package com.example.peopleinfolist.people;


import com.example.peopleinfolist.model.Person;
import com.example.peopleinfolist.service.PeopleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController() {
        peopleService = new PeopleService();
    }

    @GetMapping
    public ResponseEntity<List<Person>> getPeople() {
        return ResponseEntity.ok(peopleService.getPeopleList());
    }

    @PostMapping
    public ResponseEntity<Void> addPerson(@RequestBody Person person) {
        peopleService.addPerson(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
