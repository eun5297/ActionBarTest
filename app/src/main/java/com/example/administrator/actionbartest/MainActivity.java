package com.example.administrator.actionbartest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String text = "";

        switch(item.getItemId()) {
            case R.id.action_item_add:
                text = "Action item, with text, displayed if room exists";
                break;
            case R.id.action_item_search:
                text = "Action item, icon only, always displayed";
                break;
            case R.id.action_item_normal:
                text = "Normal menu item";
                break;
            default:
                return false;
        }
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        return true;
    }
}
