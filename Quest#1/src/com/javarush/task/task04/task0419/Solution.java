package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int r = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());


        if (i==e && i == r && i == y && e ==r && e== y && r == y)
            System.out.println(i);
        else {
            int d = Math.max(i, Math.max(e, Math.max(r, y)));
            System.out.println(d);
        }

        //напишите тут ваш код
    }
}
