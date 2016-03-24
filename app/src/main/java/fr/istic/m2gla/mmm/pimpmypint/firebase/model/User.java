package fr.istic.m2gla.mmm.pimpmypint.firebase.model;

import java.util.List;

/**
 * Created by Antoine Brezillon on 21/03/16.
 */
public class User {

    private String name;
    private List<User> contacts;
    private List<Review> reviews;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<User> getContacts() {
        return contacts;
    }
}
