// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package Seminar3.Homework;

import java.util.ArrayList;
import java.util.Random;

public class zadacha2 {
    public static int FoundMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min; 
    }

    public static int FoundMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max; 
    }

    public static double Average(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        return sum / list.size(); 
    }
    
    public static void main(String[] args) {
        Random rdm = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(rdm.nextInt(1, 10));   
        }  
        System.out.println(list);
        System.out.println("минимальное значение: " + FoundMin(list));
        System.out.println("максимальное значение: " + FoundMax(list));
        System.out.println("среднее арифметическое: " + Average(list));
    }   
}
