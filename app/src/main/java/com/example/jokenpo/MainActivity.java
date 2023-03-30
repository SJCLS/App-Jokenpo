package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcPedra(View view) {
        this.opcSelecionada("pedra");
    }

    public void opcPapel(View view) {
        this.opcSelecionada("papel");
    }

    public void opcTesoura(View view) {
        this.opcSelecionada("tesoura");
    }

    public void opcSelecionada(String opcSelecionada) {
        List<String> jokempo = Arrays.asList("pedra", "papel", "tesoura");
        int opcApp = new Random().nextInt(jokempo.size());
        ImageView img = findViewById(R.id.imgPadrao);
        TextView resultado = findViewById(R.id.txtResultado);


        switch (opcApp) {
            case 0:
                img.setImageResource(R.drawable.pedra);
                break;
            case 1:
                img.setImageResource(R.drawable.papel);
                break;
            case 2:
                img.setImageResource(R.drawable.tesoura);
                break;
        }

        if (opcSelecionada == "pedra" && opcApp == 2 || opcSelecionada == "papel" && opcApp == 0 || opcSelecionada == "tesoura" && opcApp == 1) {
            resultado.setText("Você ganhou!!!");

        } else if (opcSelecionada == "pedra" && opcApp == 1 || opcSelecionada == "papel" && opcApp == 2 || opcSelecionada == "tesoura" && opcApp == 0) {
            resultado.setText("Você perdeu, Tente novamente!");

        } else {
            resultado.setText("Empate, Tente novamente!");
        }
    }

}