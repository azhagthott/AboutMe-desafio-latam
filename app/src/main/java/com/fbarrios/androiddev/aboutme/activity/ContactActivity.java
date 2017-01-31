package com.fbarrios.androiddev.aboutme.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.fbarrios.androiddev.aboutme.R;

public class ContactActivity extends AppCompatActivity {

    private TextView tvLinkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvLinkedin = (TextView) findViewById(R.id.tvLinkedin);


    }

}
