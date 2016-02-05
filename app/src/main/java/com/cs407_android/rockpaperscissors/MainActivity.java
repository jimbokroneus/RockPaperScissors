package com.cs407_android.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.xgc1986.ripplebutton.widget.RippleButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Uncomment for student template

        if (savedInstanceState == null) {
            //TODO: Add your code here!
        }

        End student template */

        //Something extra ;)
        // Change color programatically
        RippleButton rb = (RippleButton)findViewById(R.id.play);
        int buttonColor = getResources().getColor(android.R.color.holo_red_light);
        int rippleColor = getResources().getColor(android.R.color.holo_blue_light);
        rb.setColors(buttonColor, rippleColor);


        // End TA Implementation
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void playPressed(View view) {

       //TODO
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
