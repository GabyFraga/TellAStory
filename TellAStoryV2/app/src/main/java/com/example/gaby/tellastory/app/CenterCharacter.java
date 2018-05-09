package com.example.gaby.tellastory.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.gaby.tellastory.R;

/**
 * Created by Gaby on 13/03/2018.
 */

public class CenterCharacter extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.center_character);



        Button btnCenterCharacter = (Button)findViewById(R.id.centerCharacter);

        btnCenterCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screenTransfer();

            }
        });

    }

    private void screenTransfer(){

        Bundle bdl = new Bundle();
        String character = "";
        Spinner spnr = (Spinner)findViewById(R.id.combobox_characters);
        Spinner sentences = (Spinner)findViewById(R.id.combobox_sentences);
        int numbrSentences = 0;

        character = spnr.getSelectedItem().toString();
        numbrSentences = Integer.parseInt(sentences.getSelectedItem().toString());
        bdl.putString("character", character);
        bdl.putInt("algorithm", 0);
        bdl.putInt("sentences", numbrSentences);

        Intent intent = new Intent(CenterCharacter.this, Result.class);
        intent.putExtras(bdl);

        startActivity(intent);

    }
}
