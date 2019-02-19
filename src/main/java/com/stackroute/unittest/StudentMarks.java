package com.stackroute.unittest;

import java.util.Scanner;

public class StudentMarks {

    public String studentMarks(int numOfStudents, int[] stuGrades)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students: "+numOfStudents);

        for(int i=0;i<stuGrades.length;i++)
        {
            if(stuGrades[i]>0 && stuGrades[i]<100)
            {
                return "within a range";
            }
            else
            {
                return "error!!! Marks should be within a range of 0 and 100";
            }
        }
        return null;
    }
}



