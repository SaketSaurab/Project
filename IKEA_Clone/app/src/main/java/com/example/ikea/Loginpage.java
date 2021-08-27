package com.example.ikea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Loginpage extends AppCompatActivity {

    ImageView ivhome_btn, ivsearch_btn, ivuser_btn, ivwishlist_btn, ivcart_btn, product1, product2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        ivhome_btn=findViewById(R.id.ivhome_btn);
      ivsearch_btn=findViewById(R.id.ivsearch_btn);
      ivuser_btn=findViewById(R.id.ivuser_btn);
      ivwishlist_btn=findViewById(R.id.ivwishlist_btn);
      ivcart_btn=findViewById(R.id.ivcart_btn);
        product1=findViewById(R.id.boystool);

        product2=findViewById(R.id.babychairs);



      ivhome_btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(Loginpage.this,Loginpage.class);
              startActivity(intent);
          }
      });
       ivsearch_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Loginpage.this,MainActivity2SearchActivity.class);
               startActivity(intent);
           }
       });
       ivuser_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Loginpage.this,userloginpa.class);
               startActivity(intent);
           }
       });
ivwishlist_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Loginpage.this,MainActivity2Wishlist.class);
        startActivity(intent);
    }
});

    ivcart_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Loginpage.this,MainActivity2cart.class);
            startActivity(intent);
        }
    });
product1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Loginpage.this,product1.class);
        startActivity(intent);
    }
});

product2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Loginpage.this,product2.class);
        startActivity(intent);
    }
});






    }
}