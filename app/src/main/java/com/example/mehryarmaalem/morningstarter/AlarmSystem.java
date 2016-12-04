package com.example.mehryarmaalem.morningstarter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mehryarmaalem on 2016-12-03.
 */

public class AlarmSystem {
    public Map<String, AlarmManager> alarmManagerMap;

    // constructor for Alarm System
    private AlarmSystem() {
            new AlarmSystem();
    }

    private void addAlarmManager(String alarmID, Date date, Boolean frequency, Boolean Repeat){
        //AlarmManager am = new AlarmManager(alarmID,date, frequency,Repeat);
        //alarmManagerMap.put(alarmID,am);
    }

    public void removeAlarmManager(String alarmID){
        alarmManagerMap.remove(alarmID);
    }


}