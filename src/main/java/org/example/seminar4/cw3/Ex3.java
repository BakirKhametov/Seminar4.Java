package org.example.seminar4.cw3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sumOdd = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) sumOdd += list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) list.set(i, sumOdd);
        }
        System.out.println("Лист после изменений = " + list);
    }
}
