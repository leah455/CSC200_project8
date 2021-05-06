package com.company;

//Program reads a sequence of up to 25 pairs of name and postal codes and prints list.
import java.util.Scanner;

public class PostalCodes {

    private String[] firstName = new String[25];
    private String[] lastName = new String[25];
    private int[] postalCode = new int[25];
    private int numValues = 0;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You can enter up to 25 people. How many would you like to enter?");
        numValues = keyboard.nextInt();

        System.out.println("Enter in first name, last name and postal code for each person");

        for(int i = 0; i < numValues; i++){
            firstName[i] = keyboard.next();
            lastName[i] = keyboard.next();
            postalCode[i] = keyboard.nextInt();
        }
    }

    public void printList(){
        for(int i = 0; i < numValues; i++){
            System.out.println(firstName[i] + " " + lastName[i] + " at " + postalCode[i]);
        }
    }
}
