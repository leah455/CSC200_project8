package com.company;

public class TwoDArrayTest {

    public static void main(String[] args){
        int[][] array = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        TwoDArray data = new TwoDArray();
        System.out.println("Total of array is " + data.getTotal(array));
        System.out.println("Average of array is "+ data.getAverage(array));
        System.out.println("Row 0 total is " + data.getRowTotal(array, 0));
        System.out.println("Column 1 total is " + data.getColumnTotal(array, 1));
        System.out.println("Highest in row 2 is " + data.getHighestInRow(array, 2));
        System.out.println("Lowest in row 2 is " + data.getLowestInRow(array, 2));

    }

}
