// Дано четное число N (>0) и символы c1 и c2. Написать метод, который
// вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Seminar2;

import java.util.Scanner;

public class zadacha1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int users_num = input.nextInt();
        String users_char_1 = input.next();
        String users_char_2 = input.next();
        System.out.println(users_chars(users_char_1, users_char_2, users_num));
    }

    public static String users_chars (String char1, String char2, int string_length) {
        StringBuilder users_char = new StringBuilder();

        for (int i = 1; i <= string_length/2; i++) {
            users_char.append(char1);
            users_char.append(char2);
        }
        return users_char.toString();
    
    }
}

