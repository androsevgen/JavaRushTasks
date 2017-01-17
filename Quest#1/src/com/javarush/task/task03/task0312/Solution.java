package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour){

        int i = hour * 3600;
        return i;
//        2,8 часа = 2,8 * 3600 = 10080 секунд
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(3));
        //напишите тут ваш код
    }
}
