package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int points=0;
    public void score1(View View){
        points+=3;
        displayForTeamA(points);
    }
    public void score2(View View){
        points+=2;
        displayForTeamA(points);
    }
    public void score3(View View){
        points+=1;
        displayForTeamA(points);
    }
    int points2=0;
    public void score1b(View View){
        points2+=3;
        displayForTeamB(points2);
    }
    public void score2b(View View){
        points2+=2;
        displayForTeamB(points2);
    }
    public void score3b(View View){
        points2+=1;
        displayForTeamB(points2);
    }
    public void reset(View View){
        points=0;
        points2=0;
        displayForTeamA(points);
        displayForTeamB(points2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
