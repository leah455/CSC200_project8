package com.company;

/* Program takes in 2D array and gets total sum, average sum, total sum for specific row or column,
    and determines highest and lowest number in any row. */
public class TwoDArray {

    private int totalSum = 0;

    public int getTotal(int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                totalSum += array[row][column];
            }
        }
        return totalSum;
    }

    public double getAverage(int[][] array){
        double numValues= array.length * array[0].length;
        double average = totalSum / numValues;
        return average;
    }

    public int getRowTotal(int[][] array, int row){
        int rowSum = 0;
        for(int column = 0; column < array[row].length; column++){
            rowSum += array[row][column];
        }
        return rowSum;
    }

    public int getColumnTotal(int[][] array, int column){
        int columnSum = 0;
        for(int row = 0; row < array.length; row++){
            columnSum += array[row][column];
        }
        return columnSum;
    }

    public int getHighestInRow(int[][] array, int row){
        int max = array[row][0];
        for(int column = 1; column < array[row].length; column++){
            if(array[row][column] > max){
                max = array[row][column];
            }
        }
        return max;
    }

    public int getLowestInRow(int[][] array, int row){
        int min = array[row][0];
        for(int column = 1; column < array[row].length; column++){
            if(array[row][column] < min){
                min = array[row][column];
            }
        }
        return min;
    }
}
