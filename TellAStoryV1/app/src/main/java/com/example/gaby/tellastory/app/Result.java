package com.example.gaby.tellastory.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.gaby.tellastory.R;
import com.example.gaby.tellastory.generator.StoryGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaby on 13/03/2018.
 */

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Bundle bdl = this.getIntent().getExtras();
        String character = bdl.getString("character");
        String idt = "";
        StoryGenerator gen = new StoryGenerator();
        List<String> story = new ArrayList();
        int algorithm = bdl.getInt("algorithm");

        if(algorithm == 0){
            story = gen.centeredCharacter(character, 3);
        }

        TextView txtV = ((TextView) findViewById(R.id.result0));
        if(story.get(0) != null) {
            txtV.setText(story.get(0));
        }
        txtV = ((TextView) findViewById(R.id.result1));
        if(story.get(0) != null) {
            txtV.setText(story.get(1));
        }
        txtV = ((TextView) findViewById(R.id.result2));
        if(story.get(0) != null) {
            txtV.setText(story.get(2));
        }



    }

}
