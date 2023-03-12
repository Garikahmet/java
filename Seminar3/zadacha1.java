// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

package Seminar3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class zadacha1 {
    public static void main(String[] args) {
        Random rdm = new Random();
        ArrayList<Integer> rdm_list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            rdm_list.add(rdm.nextInt(1, 10));   
        }  
        rdm_list.sort(Comparator.naturalOrder());
        System.out.print(rdm_list);
    }
    
}
