package com.example.chiamaka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    private Button btn_next,btn_prev;
    private ImageView imageView;
    int i = 0;
    private int [] textureArrayWin = {R.drawable.chiamaka,R.drawable.chiamakaa,
            R.drawable.chiamakab,R.drawable.chiamakac,R.drawable.chiamakad,R.drawable.chiamakae,
            R.drawable.chiamakaf,R.drawable.chiamakaj,R.drawable.chiamakah,R.drawable.chiamakai,
            R.drawable.chiamakaj,R.drawable.chiamakaa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_next = findViewById(R.id.btn_next);
        btn_prev = findViewById(R.id.btn_prev);
        imageView = findViewById(R.id.imageView);

        if (i == 0){
            btn_prev .setVisibility(View.GONE);
        }

//        if (i == 2){
//            btn_next.setVisibility(View.GONE);
//        }

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(textureArrayWin[i]);
                i++;
                btn_prev.setVisibility(View.VISIBLE);

                if (i == 11){
                    btn_next.setVisibility(View.GONE);
                }
//                if (i == 0){
//                    btn_prev.setVisibility(View.GONE);
//                } else {
//                    btn_prev.setVisibility(View.VISIBLE);
//                }

//                if (i == 2){
//                    btn_next.setVisibility(View.GONE);
//                }else {
//                    btn_prev.setVisibility(View.VISIBLE);
//
            }
        });

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(textureArrayWin[i]);
                i--;
                if (i == 0){
                    btn_prev.setVisibility(View.GONE);
                } else {
                    btn_next.setVisibility(View.VISIBLE);
                }

//                if (i == 2){
//                    btn_next.setVisibility(View.GONE);
//                }else {
//                    btn_prev.setVisibility(View.VISIBLE);
//                }

            }
        });

    }


}