package com.example.kaiso.habittracker;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        //fragmentTransaction.add(R.id.fragment_container, new CompanyFragment()).commit();
    }

    public void mainPage(View view) {

        Intent i = new Intent(this, HabitMain.class);
        startActivity(i);

    }
}
