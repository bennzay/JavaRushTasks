package com.javarush.task.pro.task03.task0317;

import java.util.Scanner;

/* 
Пищевой конвеер
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ch1 = console.nextInt();
        int ch2 = console.nextInt();
        int ch3 = console.nextInt();
        int ch4 = console.nextInt();

        if (ch1 > 0)
            System.out.println( ch1 );
        if (ch2 > 0)
            System.out.println( ch2 );
        if (ch3 > 0)
            System.out.println( ch3 );
        if (ch4 > 0)
            System.out.println( ch4 );
    }
}
