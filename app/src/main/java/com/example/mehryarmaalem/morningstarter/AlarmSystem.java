package com.example.mehryarmaalem.morningstarter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mehryarmaalem on 2016-12-03.
 */


// this is the AlarmSystem

public class AlarmSystem {


    public Date alarmDate;
    public String alarmId;
    public ArrayList<Boolean> frequencies;
    public boolean repeat;

    // constructor for Alarm System
    private AlarmSystem(String aID, Date alarmDate, Boolean frequency, boolean repeat) {
        alarmDate = this.alarmDate;
        repeat = this.repeat;
        frequencies.add(frequency); // this is garbage
    }


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
    private void addAlarmManager(String alarmID, Date date, Boolean frequency, Boolean Repeat){
        //AlarmManager am = new AlarmManager(alarmID,date, frequency,Repeat);
        //alarmManagerMap.put(alarmID,am);
    }
}