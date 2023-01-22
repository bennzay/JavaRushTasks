package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double speedms = console.nextInt();
        int speedkmh =(int) Math.round(speedms * 3.6);
        //speedkmh = intMath.round(speedkmh);
        System.out.println(speedkmh);


    }
}