package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    private static boolean b12;
    private static boolean b13;
    private static boolean b123;
    private static boolean b23;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ch1 = console.nextInt();
        int ch2 = console.nextInt();
        int ch3 = console.nextInt();
        b12 = ch1 == ch2;
        b13 = ch1 == ch3;
        b123 = ch1 == ch2 && ch1 == ch3;
        b23 = ch2 == ch3;
        if (b123)
            System.out.println(ch1 + " " + ch2 + " " + ch3);
        else if (b12) {
            System.out.println(ch1 + " " + ch2);
        }
        else if (b13) {
            System.out.println(ch1 + " " + ch3);
        }
        else if (b23) {
            System.out.println(ch2 + " " + ch3);
        }

    }
}
