package com.company;

//Theater seating chart as a 2D array of ticket prices. Users can pick seat or by price.
import java.util.Arrays;
import java.util.Scanner;

public class MovieSeats {

    private int[][] seatingChart;

    public MovieSeats() {
        seatingChart = new int[][]{{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
                {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
                {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};
    }

    public void displayChart(){
        System.out.println(Arrays.deepToString(seatingChart).
                replace("], ", "]\n"));
    }

    public void userInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1 to choose by price, enter 2 to choose by seat");
        int input = keyboard.nextInt();
        if(input == 1){
            pickByPrice();
        } else {
            pickBySeat();
        }
    }

    public void pickByPrice(){
        int row = 0;
        int column = 0;
        System.out.println("Specify the price of the seat you want to buy");
        Scanner keyboard = new Scanner(System.in);
        int price = keyboard.nextInt();

        switch(price){
            case 10:
                row = 1;
                column = 3;
                break;
            case 20:
                row = 4;
                column = 6;
                break;
            case 30:
                row = 7;
                column = 2;
                break;
            case 40:
                row = 7;
                column = 4;
                break;
            case 50:
                row = 8;
                column = 5;
                break;
            default:
                System.out.println("Price not available at this movie theater");
        }
        int displayRow = row + 1;
        int displayColumn = column + 1;
        System.out.println("Your seat it at row " + displayRow + ", column " + displayColumn);
        seatingChart[row][column] = 0;
    }

    public void pickBySeat(){
        System.out.println("Enter in row and column number for seat");
        Scanner keyboard = new Scanner(System.in);
        int row = keyboard.nextInt();
        int column = keyboard.nextInt();

        if(isTaken(row, column)){
            System.out.println("Seat is taken, please choose another");
            pickBySeat();
        } else {
            System.out.println("Your seat it at row " + row + ", column " + column);
            seatingChart[row - 1][column - 1] = 0;
        }
    }

    public boolean isTaken(int row, int column){
        if(seatingChart[row][column] == 0){
            return true;
        } else {
            return false;
        }
    }
}



