package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < 101){
            if ((i % 3) == 0){
                i++;
                continue;
            }else {
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);

    }
}