// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package seminar4.Homework;

import java.util.LinkedList;

public class zadacha2 {

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list) {
        list.addLast(6);
        return list;
    }

    public static LinkedList<Integer> dequeue(LinkedList<Integer> list) {
        list.pollFirst();
        return list;
    }

    public static LinkedList<Integer> first(LinkedList<Integer> list) {
        list.peekFirst();
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("данный лист: " + list);
        System.out.println("после добавления: " + enqueue(list));
        System.out.println("после удаления: " + dequeue(list));
        System.out.println("после возвращения: " + first(list));
    }   
}
