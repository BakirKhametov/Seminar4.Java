package org.example.seminar4.cw2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) sum += list.get(i);
        }
        System.out.println("Сумма четных элементов = " + sum);
    }
}
