package com.example.mehryarmaalem.morningstarter;

import java.time.*;
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

    private LocalTime time;
    private int alarmId;
    private int final WEEK_DAYS = 7;
    private boolean repeat;
    private AlarmTime [] alarmTimeList;

    private final static int ID_GENERATOR = 0;

    // Constructor for AlarmManager
    public AlarmManager(LocalTime iTime, boolean [] iFrequency, boolean iRepeat){
        alarmID = ID_GENERATOR;
        ID_GENERATOR++; //change this to initial time of alarm

        time = iTime;
        alarmTimeList = new AlarmTime[WEEK_DAYS];
        repeat = iRepeat;
        if(iRepeat) {
            for (int i = 0; i < WEEK_DAYS; i++) {
                if (iFrequency[i])
                    alarmTimeList[i] = new AlarmTime(/**/);
            }
        }
        else {
            Clock clock = new Clock();
            if(iTime.isBefore(LocalDateTime.now(clock))) {
                alarmTimeList[LocalDateTime.now(clock).getDayOfWeek().getValueOf()] = new AlarmTime(/**/);
            }
            else {
                alarmTimeList[LocalDateTime(now(clock)).getDayOfWeek().getValueOf() + 1] = new AlarmTime(/**/);
            }
        }
    }


}


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
