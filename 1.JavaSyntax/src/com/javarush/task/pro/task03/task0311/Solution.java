package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if (Math.abs (a - b) < 0.000001)
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }
}
