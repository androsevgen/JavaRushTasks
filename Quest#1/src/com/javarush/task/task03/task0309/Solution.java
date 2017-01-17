package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        int i1 = 1;
        int i2 = i1 + 2;
        int i3 = i2 + 3;
        int i4 = i3 + 4;
        int i5 = i4 + 5;
        int i6 = i5 + 6;
        int i7 = i6 + 7;
        int i8 = i7 + 8;
        int i9 = i8 + 9;
        int i10 = i9 + 10;

        arrayList.add(i1);
        arrayList.add(i2);
        arrayList.add(i3);
        arrayList.add(i4);
        arrayList.add(i5);
        arrayList.add(i6);
        arrayList.add(i7);
        arrayList.add(i8);
        arrayList.add(i9);
        arrayList.add(i10);

        for (Object o :
                arrayList) {
            System.out.println(o);
        }

    }
}
