package com.example.nastia.mdlesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb= (Toolbar) findViewById(R.id.tBarMd2);
        setSupportActionBar(tb);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.assingnmentItem:
                Toast.makeText(this, "ASSIGNMENT", Toast.LENGTH_SHORT).show();
                break;
            case R.id.timerItem:
                Toast.makeText(this, "TIMER", Toast.LENGTH_SHORT).show();
                break;
            case R.id.turnedInItem:
                Toast.makeText(this, "TURNED IN", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}
