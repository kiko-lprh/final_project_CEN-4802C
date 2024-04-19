package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PersonService {

    ArrayList<Person> characters = new ArrayList<>(Arrays.asList(
            new Person(1,"Luffy",10),
            new Person(2,"Zoro",10),
            new Person(3,"Usopp",10),
            new Person(4,"Sanji",10),
            new Person(5,"Nami",10),
            new Person(6,"Chopper",10),
            new Person(7,"Vivi",10),
            new Person(8,"Robin",10),
            new Person(9,"Brook",10),
            new Person(10,"Franky",10),
            new Person(11,"Jinbe",10)

    ));

    public Person getByID(long id){
        for (Person character : characters) {
            if (character.getId() == id) {
                return character;
            }
        }
        return null;
    }
}
