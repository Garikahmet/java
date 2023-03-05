// Реализовать простой калькулятор (+ - / *)

package Seminar1.Homework;

import java.util.Scanner;

public class zadacha3 {
    public static void main(String[] args) {
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите действие (+, -, *, /): ");
        char znak = scan.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        switch(znak) {
            case '+': result = num1 + num2;
            break;
            case '-': result = num1 - num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/': result = num1 / num2;
            break;
            default: System.out.println("Введите корректное действие");
            return;
        }
        System.out.print("Ответ:" + result);
    }
}
