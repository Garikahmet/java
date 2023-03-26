import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
// процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class zadacha3 {
    public static void main(String[] args) {
        LinkedList<Integer> usersList = fillArr();
        Set<Integer> unique = unique(usersList);
        double res = (unique.size() * 100.0)/usersList.size();
        System.out.println(res);
    }

    public static LinkedList<Integer> fillArr() {
        Random rnd = new Random();
        LinkedList<Integer> usersArray = new LinkedList<>();
        for (int i = 0; i < 150; i++) {
            usersArray.add(rnd.nextInt(101));
        }
        return usersArray;
    }

    public static Set <Integer> unique (LinkedList<Integer> usersList) {
        return new HashSet<Integer>(usersList);
    }
}
