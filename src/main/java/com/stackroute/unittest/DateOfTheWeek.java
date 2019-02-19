package com.stackroute.unittest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class DateOfTheWeek {


    public boolean date(String date1, String date2){
//    {
//        Date d1=new Date();
//        d1.setDate(date1);
//
//        Date d2 = new Date();
//        d2.setDate(date2);
//
//        Calendar c1 = Calendar.getInstance();
//        c1.setTime(d1);
//        Calendar c2 = Calendar.getInstance();
//        c2.setTime(d2);
//        System.out.println(c1.get(c1.DAY_OF_WEEK));
//        System.out.println(c2.get(c2.DAY_OF_WEEK));
//
//        if((c1.DAY_OF_WEEK==2) && (c2.DAY_OF_WEEK==1))
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }

        Date d1 = null;
        Date d2=null;
        try {
            d1 = new SimpleDateFormat("ddMMyyyy").parse(date1);
            d2 = new SimpleDateFormat("ddMMyyyy").parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
        String firstDay=simpleDateformat.format(d1);
        String lastDay=simpleDateformat.format(d2);

        if(firstDay.equals("Mon") && lastDay.equals("Sun")) {
            return true;
        }
        return false;

    }
}

