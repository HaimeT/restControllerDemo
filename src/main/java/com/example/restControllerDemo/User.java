package com.example.restControllerDemo;

import java.util.List;
//New Java Class and name it User
public class User {
    //Add an instance field of type String and call it name.
    private String name;

    //constructor for  User class
    public User(String name) {
        this.name = name;
    }
    // getter  for  name variable.

    public String getName() {
        return this.name;
    }
    //Setter

    public void setName(String name) {
        this.name = name;
    }

}
