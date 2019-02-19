package com.stackroute.unittest;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class DateOfTheWeekTest {

    DateOfTheWeek d = new DateOfTheWeek();
    @Test
    public void date() {

        assertEquals(true,d.date("24072017","30072017"));
    }
}