package com.example.gaby.tellastory.generator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaby on 13/03/2018.
 */

public class Node {

    private String group;
    private List<String> words;
    private List<String> connections;

    public Node(){

        this.group = null;
        this.words = null;
        this.connections = new ArrayList();

    }

    public Node(String group){

        this.group = group;
        this.words = null;
        this.connections = new ArrayList();

    }

    public Node(String group, List<String> words){

        this.group = group;
        this.words = words;
        this.connections = new ArrayList();

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<String> getWordList() {
        return words;
    }

    public void setWordList(List<String> words) {
        this.words = words;
    }

    public List<String> getConnections() {
        return connections;
    }

    public void setConnections(List<String> connections) {
        this.connections = connections;
    }

    public void insertConnection(String group){

        //System.out.println("Entrei: " + word.getName());

        this.connections.add(group);

        //System.out.println("Agora: " + this.connections.get(this.connections.size()-1).getName());
    }

    public boolean hasWord(String word){

        if(word == group){

                return true;

        }

        return false;

    }
}
