package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int botles = console.nextInt();
        int human = console.nextInt();
        double del = 1.0 * botles / human;
        System.out.println(del);


    }
}