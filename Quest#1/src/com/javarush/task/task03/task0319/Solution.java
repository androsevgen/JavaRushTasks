package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    private String string = "получает";
    private String string1 = "через";//лет. Му-ха-ха!
    private String string2 = "лет.";//лет. Му-ха-ха!

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String age = reader.readLine();
        String age2 = reader.readLine();
        int aage = Integer.parseInt(age);
        int aage1 = Integer.parseInt(age2);


        System.out.println(name + " " + solution.getString() + " " + age + " " + solution.getString1() + " " + age2 + " " + solution.getString2());


    }

    public String getString2() {
        return string2;
    }

    public String getString() {
        return string;
    }

    public String getString1() {
        return string1;
    }
}
