package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();

        if (age > 17 & age < 29)
            System.out.println(name + militaryCommissar);
        else
            System.out.println(name + " оставайтесь дома");

    }
}
