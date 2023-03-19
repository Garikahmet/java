// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package seminar4.Homework;

import java.util.LinkedList;

public class zadacha1 {
    
     public static LinkedList<Integer> Reverselist(LinkedList<Integer> list) {
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = list.size() -1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        return list2;
     }

     public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(Reverselist(list));
    }
}
