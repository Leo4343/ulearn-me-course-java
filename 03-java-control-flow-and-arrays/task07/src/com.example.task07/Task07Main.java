package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {

        int[] myArray = new int[4];
        myArray[0] = 2;
        myArray[1] = 10;
        myArray[2] = 10;
        myArray[3] = 0;
        System.out.println(sum(myArray));

    }

    static int sum(int[] arr) {

        int sum = 0;

        for (int a : arr) {
           sum += a;
        }
        return sum;
    }
}