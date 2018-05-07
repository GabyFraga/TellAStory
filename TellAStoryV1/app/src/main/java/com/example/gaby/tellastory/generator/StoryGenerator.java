package com.example.gaby.tellastory.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Gaby on 13/03/2018.
 */

public class StoryGenerator {

    public static Graph graph = new Graph();

     public Node getNode(String word){

        Node node = new Node();

        for (int k = 0; k < graph.graph.size(); k++) {

            if (graph.graph.get(k).hasWord(word)){

                node = graph.graph.get(k);

            }
        }

        return node;

    }

    public List<String> centeredCharacter(String word, int sentences){

        graph.populateGraph();
        Node centerNode = graph.getNode(word);
        Node node = centerNode;
        String sentence, newWord, newNode;
        Date date = new Date();
        Random random = new Random();
        List<String> story = new ArrayList();

        int seed = random.nextInt(Math.abs((int)date.getTime()));

        while(sentences > 0){

            sentence = "The " + word;

            seed = seed % centerNode.getConnections().size();
            newNode = centerNode.getConnections().get(seed);
            node = getNode(newNode);
            seed = random.nextInt(Math.abs((int)date.getTime()));
            seed = seed % node.getWordList().size();
            newWord = node.getWordList().get(seed);
            sentence = sentence + " " + newWord;

            seed = random.nextInt(Math.abs((int)date.getTime()));
            seed = seed % node.getConnections().size();
            newNode = node.getConnections().get(seed);
            node = getNode(newNode);
            seed = random.nextInt(Math.abs((int)date.getTime()));
            seed = seed % node.getWordList().size();
            newWord = node.getWordList().get(seed);
            sentence = sentence + " " + newWord + ".";


            if(!story.contains(sentence)){

                story.add(sentence);
                sentences --;
                //System.out.println(sentence);
                story.add(sentence);
            }

        }

        return story;

    }

    /**
     * @param args the command line arguments
     */

     //public static void main(String[] args) {

     //       StoryGenerator storyGenerator = new StoryGenerator();
     //       storyGenerator.centeredCharacter("cat", 2, graph);
     //}
}
