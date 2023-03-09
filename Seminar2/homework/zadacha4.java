// К калькулятору из предыдущего дз добавить логирование.

package Seminar2.homework;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class zadacha4 {
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
        System.out.print("Ответ: " + num1 + znak + num2 + "=" + result);
        
        Logger logger = Logger.getLogger(Ex0043.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        logger.info("Тестовое логирование");
    }
}
    
    
