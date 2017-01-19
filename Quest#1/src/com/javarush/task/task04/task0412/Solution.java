package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());

//        int i = scanner.nextInt();

        if (i>0)
        {
           i = i+i;
            System.out.println(i);
        }
        if (i<0){
            i = i+1;
            System.out.println(i);
        }
        if (i==0)
            System.out.println(0);


        //напишите тут ваш код

    }

}