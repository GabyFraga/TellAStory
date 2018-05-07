package com.example.gaby.tellastory.generator;

/**
 * Created by Gaby on 13/03/2018.
 */

public class Word {

    private String name;
    private String type;
    private String group;

    public Word(){

        this.name = "";
        this.type = null;
        this.group = null;

    }

    public Word(String name){

        this.name = name;
        this.type = null;
        this.group = null;

    }

    public Word(String name, String type, String group){

        this.name = name;
        this.type = type;
        this.group = group;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
