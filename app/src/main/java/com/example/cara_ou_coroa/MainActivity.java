package com.example.cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.jogar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),ResultadoActivity.class);

                //Passar dados para proxima tela
                // ramdom cria um dado aleatorio de acordo com os parametros
                int numero = new Random().nextInt(2); // 0 1
                intent.putExtra("numero", numero);

                startActivity(intent);

            }
        });
    }
}