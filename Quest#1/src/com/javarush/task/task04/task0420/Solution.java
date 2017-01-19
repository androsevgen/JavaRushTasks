package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

     ArrayList arrayList = new ArrayList();

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int r = Integer.parseInt(reader.readLine());



        Solution solution = new Solution();
        solution.arrayList.add(i);
        solution.arrayList.add(e);
        solution.arrayList.add(r);

        Collections.sort(solution.arrayList, Collections.reverseOrder());


        for (int j = 0; j < solution.arrayList.size(); j++) {
            System.out.println(solution.arrayList.get(j));
        }

         //напишите тут ваш код
    }


}
