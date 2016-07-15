package com.example.sol.lasthour;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mainactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void secAct(View v)
    {
        Intent i=new Intent(Mainactivity.this,AllYear.class);
        startActivity(i);
    }
    public void rateUs(View v){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/"));
        startActivity(i);
    }
}