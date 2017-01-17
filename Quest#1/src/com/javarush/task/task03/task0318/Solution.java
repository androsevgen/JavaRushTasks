package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution{
    private String string = "захватит мир через";
    private String string1 = "лет. Му-ха-ха";//лет. Му-ха-ха!

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String age = reader.readLine();
        int aage = Integer.parseInt(age);
        String name = reader.readLine();


        System.out.println(name + " " + solution.getString() + " " + age + " " + solution.getString1());


    }

    public String getString() {
        return string;
    }

    public String getString1() {
        return string1;
    }
}
