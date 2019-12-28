package com.tes.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tv_second;
    Button btn_next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_second = (TextView) findViewById(R.id.tv_second);
        btn_next = (Button) findViewById(R.id.btn_next);

        //Button Back in Action Bar
        ActionBar backMenu = getSupportActionBar();
        backMenu.setDisplayShowHomeEnabled(true);
        backMenu.setDisplayHomeAsUpEnabled(true);

        Intent previousIntent = getIntent();
        Bundle bundle = previousIntent.getExtras();

        final String text_prvActivity = bundle.getString("data_input");
        Log.i("SecondActivity","text : "+text_prvActivity);

        tv_second.setText(text_prvActivity);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("inputs",tv_second.getText().toString());

                Intent intents = new Intent(SecondActivity.this,ThirdActivity.class);
                intents.putExtras(bundle1);
                startActivity(intents);
            }
        });
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
