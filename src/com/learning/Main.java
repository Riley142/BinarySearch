package com.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20, 21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33,
                34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67,
                68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84,
                85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100");
        int searchingFor = input.nextInt();

        int result = binarySearch(someArray, searchingFor);

        if (result == Integer.MAX_VALUE) {
            System.out.printf("Array doesn't include the number %d", searchingFor);
        } else {
            System.out.printf("The number: %d was found", searchingFor);
        }
    }



    public static int binarySearch(int[] someArray, int searchingFor) {
        int index = Integer.MAX_VALUE;
        int startingNumber = someArray[0];
        int lastNumber = someArray.length -1;

        while (startingNumber <= lastNumber) {
            int middle = (startingNumber + lastNumber) / 2;

            if(someArray[middle] < searchingFor) {
                startingNumber = middle + 1;
                System.out.println("Chop, chop in half, the number is bigger!");
            } else if (someArray[middle] > searchingFor) {
                lastNumber = middle - 1;
                System.out.println("Chop, chop in half, the number is smaller!");
//                Thread.sleep(1);
            } else if (someArray[middle] == searchingFor) {
                index = searchingFor;
                break;
            }

            try {
                Thread.sleep(800);
            } catch(InterruptedException e) {
                System.out.println("Something is wrong!");
            }

        }
        return index;
    }

}
