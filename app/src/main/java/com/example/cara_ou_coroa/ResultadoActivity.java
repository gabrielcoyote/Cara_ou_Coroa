package com.example.cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView view;
    private ImageButton btnsair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        view = findViewById(R.id.imageViewresultado);
        btnsair = findViewById(R.id.imageButtonsair);

        btnsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // finaliza a activity
                finish();

            }
        });

        // recuperar dados

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0 ){
        // cara
        view.setImageResource(R.drawable.moeda_cara);
        }
        else {
        //coroa
            view.setImageResource(R.drawable.moeda_coroa);
        }
    }
}
