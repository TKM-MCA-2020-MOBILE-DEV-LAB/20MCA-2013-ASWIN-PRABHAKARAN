package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2, e3;
    TextView t1, t2;
    Button b1;
    String strings[] = {"dosa & sambar", "appam & eggcurry", "puttu & beefroast"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.fud);
        e1 = (EditText) findViewById(R.id.Name);
        t2 = (TextView) findViewById(R.id.item);
        e2 = (EditText) findViewById(R.id.loc);
        e3 = (EditText) findViewById(R.id.time);
        b1 = (Button) findViewById(R.id.sub);

        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str1 = t1.getText().toString();
            String str2 = e1.getText().toString();
            String str3 = t2.getText().toString();
            String str4 = e2.getText().toString();
            String str5 = e3.getText().toString();


            Intent intent = new Intent(getApplicationContext(),fragment_1.class);
            intent.putExtra("message", str1);
            intent.putExtra("message", str2);
            intent.putExtra("message", str3);
            intent.putExtra("message", str4);
            intent.putExtra("message", str5);

            startActivity(intent);
        }
    });

    }

}




