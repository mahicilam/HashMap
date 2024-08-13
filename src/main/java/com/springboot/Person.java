package com.springboot;

import java.util.Comparator;

public class Person {

    int age;
    String name;
    int weight;

    public Person(int age, String name, int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Person {" + "age=" + age + ", name='" + name + '\'' + ", weight=" + weight + '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

