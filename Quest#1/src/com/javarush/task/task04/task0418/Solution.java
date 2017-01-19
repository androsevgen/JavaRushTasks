package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        if (i==e)
            System.out.println(i);
        else {
            int d = Math.min(i, e);
            System.out.println(d);
        }

        //напишите тут ваш код
    }
}