package com.example.gaby.tellastory.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gaby.tellastory.R;
import com.example.gaby.tellastory.generator.Graph;

import java.util.ArrayList;
import java.util.List;

public class TellAStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tellastory);

        Button btnCenterCharacter = (Button)findViewById(R.id.centerCharacter);

        btnCenterCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(TellAStory.this, CenterCharacter.class));
            }
        });
    }
}
