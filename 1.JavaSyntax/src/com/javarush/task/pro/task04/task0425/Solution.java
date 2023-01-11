package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int h = 0; h < 10; h++) {
            for (int w = 0; w < 11; w++) {
                if (h == 9 && w < 10) {
                    System.out.print(bug);
                } else if (h == 0 && w < 3) {
                    System.out.print(land);
                } else if (h == 0 && w == 3) {
                    System.out.print(robot);
                } else if (h == 0 && w > 3 && w < 10) {
                    System.out.print(land);
                } else if (h > 0 && h < 9 && w < 10) {
                    System.out.print(land);
                } else if (w == 10 && h < 10) {
                    System.out.println();
                }
            }
        }
    }
}
