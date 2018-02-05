package com.example.tech.wats_hannpanaitte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main3Activity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main3Activity.this,Main7Activity.class);
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main3Activity.this,Main8Activity.class);
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main3Activity.this,Main9Activity.class);
                startActivity(intent);
            }
        });
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main3Activity.this,Main10Activity.class);
                startActivity(intent);
            }
        });

    }
}
