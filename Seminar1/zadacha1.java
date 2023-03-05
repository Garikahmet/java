// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

package Seminar1;

import java.util.Scanner;

public class zadacha1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in,"Cp866");
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("привет, %s", name);
        iScanner.close();

    }
    
}
