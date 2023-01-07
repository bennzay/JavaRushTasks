package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console =  new Scanner(System.in);
        int ch1 = console.nextInt();
        int ch2 = console.nextInt();
        int ch3 = console.nextInt();
        int sum = ch1 + ch2 + ch3;
        int z = sum / 3;
        System.out.println(z);

    }
}
