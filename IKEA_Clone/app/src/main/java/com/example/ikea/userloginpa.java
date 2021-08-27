package com.example.ikea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userloginpa extends AppCompatActivity {

    Button btnCreateNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userloginpa);

        btnCreateNow=findViewById(R.id.btnCreateNow);
        btnCreateNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(userloginpa.this,SignUppage.class);
                startActivity(intent);
            }
        });

    }
}