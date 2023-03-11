package com.ilke;

import java.util.Scanner;

public class Arrays_Exercise {

//Write a program that displays the sum, product and average of the elements of an int array.
//Ask user for the length of array and also take array elements from user.


    public static void main(String[] args){
        System.out.println("Enter the length of your array: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        int[] my_array = new int[len];


        System.out.println("Fill your array: ");
        for (int i=0 ; i<len ; i++){
            my_array[i] = input.nextInt();
        }



        int s = sum(my_array);
        product(my_array);
        avg(s,len);

    }

    public static int sum(int[] array) {
        int sum=0;

        for(int i=0 ; i< array.length ; i++){
            sum+=array[i];
        }
        System.out.println("Sum: " + sum);
        return sum;
    }

    public static int product(int[] array) {
        int product=1;
        for (int i=0 ; i< array.length ; i++){
            product *= array[i];
        }
        System.out.println("Product: " + product);
        return product;
    }

    public static int avg(int total, int len){
        int average=0;
        average = total/len;
        System.out.println("Average: " + average);
        return average;
    }
}
