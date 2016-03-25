package fr.istic.m2gla.mmm.pimpmypint.firebase.model;

/**
 * Created by gesti on 24/03/2016.
 */
public class Review {

    private int stars;
    private String idUser;
    private String idBeers;

    public Review() {
    }

    public Review(int stars, String idUser, String idBeers) {
        this.stars = stars;
        this.idUser = idUser;
        this.idBeers = idBeers;
    }

    public int getStars() {
        return stars;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getIdBeers() {
        return idBeers;
    }
}
