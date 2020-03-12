package com.YosuaMartiansia.A2;

public class Person {
    private Name name_;

    public Person() {
        // empty on purpose - default constructor
    }

    public Person(Name t_name) {
        this.name_ = t_name;
    }

    public String hello(String t_name) {
        return "Hello " + t_name;
    }

    public String hello_World() {
        return "Hello World";
    }
}
