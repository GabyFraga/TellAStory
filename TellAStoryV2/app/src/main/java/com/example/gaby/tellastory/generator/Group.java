package com.example.gaby.tellastory.generator;

/**
 * Created by Gaby on 13/03/2018.
 */

public class Group {

    public final String ANIMAL = "animal";
    public final String FOOD = "food";
    public final String EATS = "eats";
    public final String FEEDS = "feeds";
    public final String LIKES = "likes";
    public final String SELLS = "sells";
    public final String STORE = "store";
    public final String FAMILY = "family";
    public final String OWNS = "owns";
    public final String HAS = "has";
    public final String RIDES = "rides";
    public final String VEHICLE = "vehicle";
    public final String GOESTO = "goes to the";

    public Group() {
    }

    public String getGroup(String group){

        switch (group) {
            case "animal":
                return ANIMAL;
            case "food":
                return FOOD;
            case "eats":
                return EATS;
            case "feeds":
                return FEEDS;
            case "likes":
                return LIKES;
            case "sells":
                return SELLS;
            case "store":
                return STORE;
            case "family":
                return FAMILY;
            case "owns":
                return OWNS;
            case "has":
                return HAS;
            case "rides":
                return RIDES;
            case "vehicle":
                return VEHICLE;
            case "goes to":
                return GOESTO;
            default:
                return null;
        }

    }
}
