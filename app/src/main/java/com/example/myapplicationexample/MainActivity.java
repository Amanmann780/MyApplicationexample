package com.example.myapplicationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater =getMenuInflater();
        mMenuInflater.inflate((R.menu.menu_main,menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menufav:
                msg = "favourite":
                break;
            case R.id.menufirst:
                msg = "First";
                break:
            case R.id.menuloc:
                msg  = "location";
                break;
            case R.id.menulogout:
                msg = "logout"
                        break;
        }
        return super.onOptionsItemSelected(item);
    }
}