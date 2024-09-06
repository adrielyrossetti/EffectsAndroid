package com.example.efeitosnoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTexto = findViewById(R.id.txtTexto);
        ImageView imgsunflower = findViewById(R.id.imgsunflower);
        Button btnAnimacao = findViewById(R.id.btnAnimacao);
        btnAnimacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animation = ObjectAnimator.ofFloat(txtTexto, "rotation", 0f, 360f);
                animation.setDuration(1000);
                animation.setRepeatCount(ValueAnimator.RESTART);
                animation.start();

            }

        });
        Button btnTransparencia = findViewById(R.id.btnTransparencia);
        btnTransparencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsunflower.setImageAlpha(1);
            }
        });
        Button btnTransicao = findViewById(R.id.btnTransicao);
        btnTransicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsunflower.animate().translationX(-200f).setDuration(500).start();
            }
        });





    }

}