package com.example.tech.wats_hannpanaitte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        ImageButton imagebutton = findViewById(R.id.imageButton9);
        imagebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main15Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
