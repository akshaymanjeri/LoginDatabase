package com.akshay.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText etname,etage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etname = (EditText) findViewById(R.id.name);
        etage = (EditText) findViewById(R.id.age);
    }
    
    //Method invoked when Add Button is clicked in Register Activity
    public void OnAdd(View view){
        String name = etname.getText().toString();
        String age = etage.getText().toString();
        String type="add";
        BackgroundWorker backgroundworker = new BackgroundWorker(this);
        backgroundworker.execute(type,name,age);
    }
    
    //Methos invoked when Logout Button is clicked in Register Activity
    public void Logout(View view){
        Intent i =new Intent(getApplicationContext(),Login.class);
        startActivity(i);
    }
}
