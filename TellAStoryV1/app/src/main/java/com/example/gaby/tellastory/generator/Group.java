package com.example.gaby.tellastory.generator;

/**
 * Created by Gaby on 13/03/2018.
 */

public class Group {

    public final String ANIMAL = "animal";
    public final String FOOD = "food";
    public final String EATS = "eats";

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
            default:
                return null;
        }

    }
}
