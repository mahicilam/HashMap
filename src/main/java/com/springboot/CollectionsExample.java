package com.springboot;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionsExample {

    public static void main(String[] args) {

//        List<Person> people = new ArrayList<>(Arrays.asList(
//                new Person(25,"Bobby",65),
//                new Person (41, "Venice",67),
//                new Person(38,"Murphy",88),
//                new Person(32,"Alice", 72)
//        ));

        List<Person> people = new ArrayList<>();

        people.add(new Person(25,"Bobby",65));
        people.add(new Person (41, "Venice",67));
        people.add(new Person(38,"Murphy",88));
        people.add(new Person(32,"Alice", 72));

        System.out.println("The list of people before sorting" + people);

        Collections.sort(people, new PersonByAge());
        System.out.println("The list of people after sorting by their age " + people);

        Collections.sort(people, new PersonByName());

        System.out.println("The list of people after sorting by their names " + people);

        Collections.sort(people, new PersonByWeight());

        System.out.println("The list of people after sorting by their weights " + people);

    }
}

