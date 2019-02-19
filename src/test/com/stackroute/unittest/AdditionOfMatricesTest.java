package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest {

    AdditionOfMatrices a = new AdditionOfMatrices();
    @Test
    public void matrix1() {
        int row1=3;
        int col1=2;
        int [][] martix1={{1,2},{3,4},{5,6}};
        int [][] matrix2={{9,8},{7,6},{5,4}};
        int [][] add1={{10,10},{10,10},{10,10}};
        assertArrayEquals(add1,a.matrix(row1,col1,martix1,matrix2));
    }

    @Test
    public void matrix2() {
        int row2=2;
        int col2=2;
        int [][] martix1={{1,2},{3,4}};
        int [][] matrix2={{9,9},{7,6}};
        int [][] add2={{10,11},{10,10}};

        assertEquals(add2,a.matrix(row2,col2,martix1,matrix2));
    }

}