package com.tes.project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    TextView tv_third;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Button Back in Action Bar
        ActionBar backMenu = getSupportActionBar();
        backMenu.setDisplayShowHomeEnabled(true);
        backMenu.setDisplayHomeAsUpEnabled(true);

        tv_third = (TextView) findViewById(R.id.tv_third);

        Intent previousIntent2 = getIntent();
        Bundle bundle3 = previousIntent2.getExtras();

        tv_third.setText(bundle3.getString("inputs"));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
