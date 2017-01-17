package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertEurToUsd(12, 3.2));
        System.out.println(convertEurToUsd(10, 5.2));
        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        double d = eur * course;
        return d;

        //напишите тут ваш код долларСША = евро * курс
    }
}
