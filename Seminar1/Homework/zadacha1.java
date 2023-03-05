// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

package Seminar1.Homework;

import java.util.Scanner;

public class zadacha1 {
    
    static int calculateTreug (int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    static int calculateFactorial (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
            
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scan.nextInt();
        System.out.println("Сумма чисел n = " + calculateTreug(n));
        System.out.println("Факториал числа n! = " + calculateFactorial(n));
    }
    
}
