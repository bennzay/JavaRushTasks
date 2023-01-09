package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inpstr;

        while (true){
            inpstr = console.nextLine();
            if (inpstr.equalsIgnoreCase("enough")){
                break;
            }else {
                System.out.println(inpstr);
            }
        }

    }
}