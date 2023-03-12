// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Seminar3.Homework;

import java.util.ArrayList;
import java.util.Random;

public class zadacha1 {
    public static void main(String[] args) {
        Random rdm = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(rdm.nextInt(1, 10));   
        }  
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    
}
