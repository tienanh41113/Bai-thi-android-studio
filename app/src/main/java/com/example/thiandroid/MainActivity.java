package com.example.thiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText TextN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextN = (EditText) findViewById(R.id.TextN);
    }

    public void onClick(View view) {
        int n = Integer.parseInt(TextN.getText().toString());
        String s = "";

        for (int i = 1; i <= n; i++)
            if (i % 2 != 0)
                s += i + " ";

        Intent intent = new Intent(this, ActivityB.class);
        intent.putExtra("odd", s);
        startActivity(intent);
    }
}