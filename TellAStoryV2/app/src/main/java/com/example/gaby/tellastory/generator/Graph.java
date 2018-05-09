package com.example.gaby.tellastory.generator;

import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaby on 13/03/2018.
 */

public class Graph{

    public List<Node> graph;

    public Graph(){

        graph = new ArrayList();

    }

    public void showGraph() {

        for(int i = 0; i < graph.size(); i++){

            System.out.println("Grupo: " + graph.get(i).getGroup());

            for(int j = 0; j < graph.get(i).getWordList().size(); j++){

                System.out.println("Palavra: " + graph.get(i).getWordList().get(j));

            }

            for(int k = 0; k < graph.get(i).getConnections().size(); k++){

                System.out.println("Conexão: " + graph.get(i).getConnections().get(k));

            }

        }

    }

    Node getNode(String word){

        Node node = new Node();

        for (int k = 0; k < graph.size(); k++) {

            for(int i = 0; i < graph.get(k).getWordList().size(); i++) {

                if (graph.get(k).getWordList().get(i).equals(word)) {

                    node = graph.get(k);

                }
            }
        }

        return node;

    }

    public void populateGraph(){

        Node node = new Node();
        Group group = new Group();
        List<String> names = new ArrayList();

        names.add("cat");
        names.add("tiger");
        names.add("dog");
        names.add("bird");
        names.add("bat");

        node.setGroup(group.ANIMAL);
        node.setWordList(names);
        node.insertConnection(group.EATS);
        node.insertConnection(group.OWNS);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("eats");

        node.setGroup(group.EATS);
        node.setWordList(names);
        node.insertConnection(group.FOOD);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("potato");
        names.add("lettuce");
        names.add("apple");
        names.add("banana");
        names.add("pear");

        node.setGroup(group.FOOD);
        node.setWordList(names);
        node.insertConnection(group.FEEDS);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("feeds");

        node.setGroup(group.FEEDS);
        node.setWordList(names);
        node.insertConnection(group.ANIMAL);
        node.insertConnection(group.FAMILY);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("likes");

        node.setGroup(group.LIKES);
        node.setWordList(names);
        node.insertConnection(group.FOOD);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("sells");

        node.setGroup(group.SELLS);
        node.setWordList(names);
        node.insertConnection(group.FOOD);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("restaurant");
        names.add("grocery shop");
        names.add("vending stall");
        names.add("diner");
        names.add("food truck");

        node.setGroup(group.STORE);
        node.setWordList(names);
        node.insertConnection(group.SELLS);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("dad");
        names.add("mom");
        names.add("sister");
        names.add("brother");
        names.add("aunt");

        node.setGroup(group.FAMILY);
        node.setWordList(names);
        node.insertConnection(group.EATS);
        node.insertConnection(group.OWNS);
        node.insertConnection(group.RIDES);
        node.insertConnection(group.HAS);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("has");

        node.setGroup(group.HAS);
        node.setWordList(names);
        node.insertConnection(group.ANIMAL);
        node.insertConnection(group.VEHICLE);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("rides");

        node.setGroup(group.RIDES);
        node.setWordList(names);
        node.insertConnection(group.VEHICLE);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("owns");

        node.setGroup(group.OWNS);
        node.setWordList(names);
        node.insertConnection(group.VEHICLE);
        node.insertConnection(group.STORE);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("goes to the");

        node.setGroup(group.GOESTO);
        node.setWordList(names);
        node.insertConnection(group.STORE);

        graph.add(node);

        names = new ArrayList();
        node = new Node();

        names.add("car");
        names.add("bus");
        names.add("bike");
        names.add("skate");
        names.add("plane");

        node.setGroup(group.VEHICLE);
        node.setWordList(names);
        node.insertConnection(group.GOESTO);

        //showGraph();

    }
}
