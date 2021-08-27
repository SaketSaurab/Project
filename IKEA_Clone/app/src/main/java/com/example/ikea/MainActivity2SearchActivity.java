package com.example.ikea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity2SearchActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutManager;
    String[] programNameList={"Interiear","Stool","Kitechen","HandTools","Appliances",
            "Chair","Coloured Sofa","Foldable Sofa","Reflectors",
            "Iron Sofa","L shape Sofa","Two Seater Sofa","Single Seat Sofa", "Stool Chair",
            "Stick Chair","Triple Seat Sofa", "Wooden Sofa"};
    String[] programDescriptionList={"Inside Room decoration","Table and Chairs","Daily use Handtools","appliances","electronic",
            "Chair Combo","Wide variety of colourful sofa","Sapace saving foldable sofa cum bed","Reflectors to enhace the beauty of your wall","Sofa Whoes base is made of iron ",
            "Diffent type of sofa","Sofa with iron base","Single seating sofa for complete rest","Small stools for babies and kids","Wooden Chair to enhance the beauty of your office",
            "A sofa with triple sitting capacity","A masterpiece wooden sofa for natural comfort","Explore the wide variety of colourfull sofa","Wooden chair with antique look"
    };
int[] programImages={R.drawable.womenworking,R.drawable.furnituresofa,R.drawable.kitchenwhitetile,R.drawable.homeimprovement,R.drawable.kitchenware,
        R.drawable.chairb,R.drawable.coloursofa,R.drawable.foldablebed,R.drawable.reflectors,R.drawable.ironsofa,
        R.drawable.lsofaq,R.drawable.ironsofa,R.drawable.singlesofa,R.drawable.boyonstool,R.drawable.woodchair,
        R.drawable.triplesofaa,R.drawable.woodensofae,R.drawable.coloursofa,R.drawable.foldablebed};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_search);

        recyclerView=findViewById(R.id.rvProgram);

recyclerView.setHasFixedSize(true);
layoutManager=new LinearLayoutManager(this);
recyclerView.setLayoutManager(layoutManager);

programAdapter=new ProgramAdapter(this,programNameList,programDescriptionList,programImages);
recyclerView.setAdapter(programAdapter);

    }
}