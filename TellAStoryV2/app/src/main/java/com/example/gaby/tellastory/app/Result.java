package com.example.gaby.tellastory.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

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

            int sentences = bdl.getInt("sentences");
            story = gen.centeredCharacter(character, sentences);

        }

        TextView txtV = ((TextView) findViewById(R.id.result0));

        for(int i = 0; i < story.size(); i++){
            txtV.append(story.get(i));
        }

    }

}
