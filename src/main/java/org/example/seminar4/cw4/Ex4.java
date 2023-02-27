package org.example.seminar4.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> ourList = new LinkedList<>(Arrays.asList(-1, -2, -3, 4, 5, -6, -7, 8, -9));
        //Вариант удаления с конца
        // for (int i = ourList.size()-1; i >= 0 ; i--) {
        // if(ourList.get(i) < 0) ourList.remove(i);
        // }
        for (int i = 0; i < ourList.size(); i++) {
            if (ourList.get(i) < 0) {
                ourList.remove(i);
                i--;
            }
            System.out.println(ourList);
        }
        System.out.println(ourList);
    }
}
