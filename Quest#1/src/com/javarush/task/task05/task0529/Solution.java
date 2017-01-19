package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String a="";
        int sum=0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!(a.equals("сумма")))
        {
            a = reader.readLine();
            if (a.matches("\\d+"))  // проверка, число ли это, она не обязательна
            {
                sum = sum + Integer.parseInt(a);
            }
        }
        System.out.print(sum);
//       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        while (true){
//
//
//
//            int i = Integer.parseInt(reader.readLine());
//            int sum =0;
//            sum = sum+i;
//
//            String s = reader.readLine();
//            String s1 = "сумма";
//            if (s.equals(s1))
//            {
//                System.out.println(sum);
//                break;
//            }
//
//        }

        //напишите тут ваш код
    }
}
