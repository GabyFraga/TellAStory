package com.example.gaby.tellastory.generator;

/**
 * Created by Gaby on 13/03/2018.
 */

public class Type {

    public final String NOUN = "noun";
    public final String ADJ = "adjective";
    public final String ADV = "adverb";
    public final String IV = "intransitive verb";
    public final String DTV = "direct transitive verb";
    public final String ITV = "indirect transitive verb";
    public final String CV = "connection verb";
    public final String DITV = "direct and indirect transitive verb";

    public Type() {
    }

    public String getType(String type){

        switch (type) {
            case "noun":
                return NOUN;
            case "adj":
                return ADJ;
            case "adv":
                return ADV;
            case "iv":
                return IV;
            case "dtv":
                return DTV;
            case "itv":
                return ITV;
            case "cv":
                return CV;
            case "ditv":
                return DTV;
            default:
                return null;
        }

    }
}
