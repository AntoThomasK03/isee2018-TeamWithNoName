package com.example.laxman.timetracker;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button button1=(Button)findViewById(R.id.buttonnew);
        Button button2=(Button)findViewById(R.id.buttonhistory);
        Button button3=(Button)findViewById(R.id.buttonsettings);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1= new Intent(Home.this,New.class);
                startActivity(int1);

            }
        });

        /*button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int2= new Intent(Home.this,History.class);
                startActivity(int2);

            }
        });*/

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3= new Intent(Home.this,Settings.class);
                startActivity(int3);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Home.this, RecordListActivity.class));

            }

        });
    }
}
