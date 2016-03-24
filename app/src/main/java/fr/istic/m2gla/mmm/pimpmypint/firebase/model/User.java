package fr.istic.m2gla.mmm.pimpmypint.firebase.model;

import java.util.List;

/**
 * Created by Antoine Brezillon on 21/03/16.
 */
public class User {

    private String name;
    private List<String> contacts;
    private List<String> reviews;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void addContatc(String userId){
        reviews.add(userId);
    }

    public void addReviews(String reviewId){
        reviews.add(reviewId);
    }
}
