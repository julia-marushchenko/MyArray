package com.array;

/**
 * Java program to demonstrate operations with arrays
 *
 * @autor Julia Marushchenko
 * @version 1.0
 * @since 2025-05-04
 */
public class Main {

    // Method main to run java program
    public static void main(String [] str){

        // Universal initialization without " = " als in C++ does not work
        int arr [] = {1, 2, 3, 4, 5};

        // To insert value 10 to position 3
        arr [3] = 10;

        // Printing arr to console
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Print element with index 2
        System.out.println("Element number 2 is : " + arr[2]);

        // Creating new array
        int arr1 [] = new int[5];

        // Inserting array in another array
        arr1 = arr;

        // Printing arr1 to console
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
