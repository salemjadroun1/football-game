package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView goal1;
    Button addgoal1;
    TextView goal2;
    Button addgoal2;
    TextView foul1;
    Button addfoul1;
    TextView foul2;
    Button addfoul2;
    Button newgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goal1 = findViewById(R.id.goal1);
        addgoal1 = findViewById(R.id.addgoal1);
        goal2 = findViewById(R.id.goal2);
        addgoal2 = findViewById(R.id.addgoal2);
        foul1 = findViewById(R.id.foul1);
        addfoul1 = findViewById(R.id.addfoul1);
        foul2 = findViewById(R.id.foul2);
        addfoul2 = findViewById(R.id.addfoul2);
        newgame = findViewById(R.id.newwgam);

        addgoal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int G1 = Integer.parseInt(goal1.getText().toString())+3;
                goal1.setText(""+G1);
            }
        });
        addfoul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int F1 = Integer.parseInt(foul1.getText().toString())+1;
                foul1.setText(""+F1);
            }
        });
        addgoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int G2 = Integer.parseInt(goal2.getText().toString())+3;
                goal2.setText(""+G2);
            }
        });
        addfoul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int F2 = Integer.parseInt(foul2.getText().toString())+1;
                foul2.setText(""+F2);
            }
        });
        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goal1.setText(""+0);
                goal2.setText(""+0);
                foul1.setText(""+0);
                foul2.setText(""+0);
            }
        });



    }



}
