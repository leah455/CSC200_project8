package com.company;

//Program initializes an array with ten random integers
import java.util.Arrays;
import java.util.Random;

public class RandomIntegers{

    private int[] numbers = new int[10];

    //Generates random integers
    public RandomIntegers(){
        Random randomGenerate = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerate.nextInt(100) + 1;
        }
    }
    //Prints out list of integers
    public void integers(){
        System.out.println("The 10 random integers are " + Arrays.toString(numbers));
    }
    //Prints out every element at an even index
    public void evenIndex(){
        System.out.println("Every element at an even index is ");
        for(int i = 0; i < numbers.length; i++){
            if (i % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
    //Prints out every even element
    public void evenElements(){
        System.out.println("Every even element is ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
    //Prints out all elements in reverse order
    public void reverseOrder(){
        int[] reverse = new int[10];
        for(int i = 9; i >= 0; i--){
            reverse[i] = numbers[i];
        }
        System.out.println("The array in reverse order is " + Arrays.toString(reverse));
    }
    //Prints out the first and last elements
    public void firstAndLast(){
        System.out.println("The first element is " + numbers[0] + " and the last element is " + numbers[9]);
    }
    //Prints out the maximum and minimum elements
    public void minAndMax(){
        int min = numbers[0];
        int max = numbers[0];
        for(int number : numbers){
            if(number < min){
                min = number;
            } else if (number > max){
                max = number;
            }
        }
        System.out.println("The minimum element is " + min + " and the maximum element is " + max);
    }
    //Prints out total sum of all the elements
    public void totalSum(){
        int totalSum = 0;
        for(int number : numbers){
            totalSum += number;
        }
        System.out.println("The sum of all the elements is " + totalSum);
    }
    //Prints out alternating sum of elements where even index elements are added while odd index elements are subtracted
    public void alternatingSum(){
        int altSum = 0;
        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0) {
                altSum += numbers[i];
            } else{
                altSum -= numbers[i];
            }
        }
        System.out.println("The alternating sum of elements is " + altSum);
    }
}



