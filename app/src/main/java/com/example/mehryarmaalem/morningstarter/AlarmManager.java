package com.example.mehryarmaalem.morningstarter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

// Calander and Util packages
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class AlarmManager extends AppCompatActivity {

    public Date alarmDate;
    public String alarmId;
    public ArrayList<Boolean> frequencies;
    public boolean repeat;

    // Constructor for AlarmManager
    public AlarmManager(){

    }

    // get the ID for the Alarm
    public String getID(){
        return alarmId;
    }

    // change the date
    public void modifyDate(Date date){
        alarmDate = date;
    }

    // add a frequency
    public void addFrequency(Boolean frequency){
        frequencies.add(frequency);
    }
    // remove a frequency
    public void removeFrequency(Boolean frequency){
        frequencies.remove(frequency);
    }
    public void modifyRepeat(Boolean repeat){
        repeat = this.repeat;
    }
    @Override
    // TODO : UI Features
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_manager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alarm_manager, menu);
        return true;
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
