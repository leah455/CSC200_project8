package com.company;

//Program reads sequence of input values and displays a bar chart using asterisks
import java.util.Scanner;

public class BarChart {

    private String[] captions;
    private int[] dataValue;
    private int max;

    public void inputValues() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter in number of input values");
        int numValues = keyboard.nextInt();
        captions = new String[numValues];
        dataValue = new int[numValues];

        for (int i = 0; i < numValues; i++) {
            System.out.println("Enter in caption:");
            captions[i] = keyboard.next();
            System.out.println("Enter in data value");
            dataValue[i] = keyboard.nextInt();
        }

        max = dataValue[0];
        for (int value : dataValue) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }

    public void displayChart() {
        for (int i = 0; i < dataValue.length; i++) {
            System.out.print(captions[i]);
            int portion = (int)(40 * (dataValue[i] / (float)max));
            for (int j = 0; j < portion; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
