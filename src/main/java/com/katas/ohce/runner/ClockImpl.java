package com.katas.ohce.runner;

import com.katas.ohce.Clock;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by atassani on 05/06/16.
 */
public class ClockImpl implements Clock {
    public int hour() {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY); // gets hour in 24h format
    }
}
