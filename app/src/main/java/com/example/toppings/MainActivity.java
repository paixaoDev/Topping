package com.example.toppings;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import developer.vmodels.TypeViewModel;

public class MainActivity extends AppCompatActivity {

    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
    }

    @Override
    protected void onStart() {
        super.onStart();
        bindViewModel();
    }

    @Override
    protected void onStop() {
        super.onStop();
        unBindViewModel();
    }

    //Usado para fazer bind quando a atividade iniciar
    public void bindViewModel (){

    }
    //Usado para fazer unbind quando a atividade pausar
    public void unBindViewModel (){

    }
}