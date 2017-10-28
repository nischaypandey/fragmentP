package com.example.rohitgiri.fragmentp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FirstFragment.onFragmentInteraction{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        FirstFragment firstFragment=FirstFragment.newInstance();
        fragmentTransaction.add(R.id.Parent_Layout,firstFragment,"Firstname");
        fragmentTransaction.addToBackStack("Firstname");
        fragmentTransaction.commit();

    }

    @Override
    public void launchSecondFragment() {
       // Toast.makeText(MainActivity.this,"helllo",Toast.LENGTH_LONG).show();
        FragmentManager fragmentManager1=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1=fragmentManager1.beginTransaction();
        SecondFragment secondFragment=SecondFragment.newInstance();
        fragmentTransaction1.replace(R.id.Parent_Layout,secondFragment,"Secondname");
        fragmentTransaction1.addToBackStack("Secondname");


        fragmentTransaction1.commit();
    }

    @Override
    public void launchThirdFragment() {
        FragmentManager fragmentManager2=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction2=fragmentManager2.beginTransaction();
        ThirdFragment thirdFragment=ThirdFragment.newInstance();
        fragmentTransaction2.replace(R.id.Parent_Layout,thirdFragment,"ThirdName");
        fragmentTransaction2.addToBackStack("ThirdName");
        fragmentTransaction2.commit();

    }
}
