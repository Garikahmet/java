// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций

package Seminar2.homework;

import java.util.Scanner;

public class zadacha3 {
    static boolean Palindrom(String name) {
        int length = name.length();
        for (int i = 0; i < (length / 2); i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String name = scan.nextLine();
        System.out.println(Palindrom(name));
    } 
}
