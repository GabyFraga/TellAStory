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

        node.setGroup(group.ANIMAL);
        node.setWordList(names);
        node.insertConnection(group.EATS);

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

        names.add("meat");
        names.add("grass");

        node.setGroup(group.FOOD);
        node.setWordList(names);

        graph.add(node);

        //showGraph();

    }
}
