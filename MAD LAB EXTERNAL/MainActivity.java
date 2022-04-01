package com.example.option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_option,menu);
        return true;
//        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent HI = new Intent(getApplicationContext(), home.class);
            startActivity(HI);
        }
        if (id == R.id.settings) {
            Intent SI = new Intent(getApplicationContext(), settings.class);
            startActivity(SI);
        }
        if (id == R.id.contact) {
            Intent HLI = new Intent(getApplicationContext(), help.class);
            startActivity(HLI);
        }
        return super.onOptionsItemSelected(item);
    }

}