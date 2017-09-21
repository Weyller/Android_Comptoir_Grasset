package com.example.eleves.android_comptoir_grasset;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NouveauPret extends AppCompatActivity {


    Button btn_choix_materiel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouveau_pret);



        setTitle("IG Pret");

        btn_choix_materiel = (Button)findViewById(R.id.btn_choix_materiel);

        btn_choix_materiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(NouveauPret.this, ChoisirMateriel.class);

                startActivity(intent);
            }
        });



    }
}
