package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Stringn[] = new String[3];
        int n[] = new int[3];
        int k = 0;
        int l = 0;

        for (int i = 0; i <= 2; i++){
            Stringn[i] = reader.readLine();
            n[i] = Integer.parseInt(Stringn[i]);
            if (n[i] >0) {
                k = k+1;
            }
            else {
                l = l+1;
            }

        }

        System.out.println("количество отрицательных чисел: " +l);
        System.out.println("количество положительных чисел: " +k);

    }}

