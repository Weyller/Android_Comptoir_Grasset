package com.example.eleves.android_comptoir_grasset;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nouveauPret;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("IG Pret");

        nouveauPret = (Button)findViewById(R.id.btNouvPret);

        nouveauPret.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NouveauPret.class);
                startActivity(intent);
            }
        });


    }
}
