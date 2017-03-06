package com.example.sakthikavin.myapplication;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    Button btnget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnget = (Button) findViewById(R.id.btnget);
        Toast.makeText(getApplicationContext(), "casper", Toast.LENGTH_LONG).show();
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void open(View view) {
        Toast.makeText(getApplicationContext(), "casper", Toast.LENGTH_LONG).show();
        Intent myintent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(myintent);
    }
};