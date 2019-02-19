package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks s = new StudentMarks();
    @Test
    public void studentMarks1() {

        int[] marks = {23,45,98};
        assertEquals("within a range",s.studentMarks(3,marks));
    }

    @Test
    public void studentMarks2() {

        int[] marks = {-24,45,102};
        assertNotEquals("within a range",s.studentMarks(3,marks));
    }

}