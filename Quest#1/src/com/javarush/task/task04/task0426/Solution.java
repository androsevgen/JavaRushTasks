package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        boolean b;
        b = a % 2 ==0;
        if (b && a < 0){
            System.out.println("отрицательное четное число");
        }
        else if (!b && a < 0){
            System.out.println("отрицательное нечетное число");
        }
        else if (b && a == 0){
            System.out.println("ноль");
        }
        else if (b && a > 0){
            System.out.println("положительное четное число");
        }
        else if (!b && a > 0){
            System.out.println("положительное нечетное число");
        }
        //напишите тут ваш код
    }
}
