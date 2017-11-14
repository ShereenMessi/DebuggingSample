package com.example.shereen.debuggingsample;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Shereen on 11/14/2017.
 */

public class CustomClass {
    public long doSomething() {
        String variable = "";
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        Date date = new Date(timeInMillis);
        date = null;
        DateFormat format = new SimpleDateFormat("dd MM yyyy");
        Log.v("Cureent Date", format.format(date));
        return timeInMillis;
    }
}
