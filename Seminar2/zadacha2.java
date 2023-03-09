// Напишите метод, который сжимает строку. Пример: вход aaaabbbcddaaa.
// результат - a4b3cd2a3

package Seminar2;

import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String users_string = scan.nextLine();
        System.out.println(cp866(users_string));
        
    }

    public static String cp866 (String users_string) {
        int counter = 1;
        StringBuilder users_cp866 = new StringBuilder();
        for (int i = 0; i < users_string.length(); i++) {
            if (users_string.charAt(i) == users_string.charAt(i + 1)) {
                counter++;
            }
            else {
                if (counter == 1) {
                    users_cp866.append(users_string.charAt(i));
                }
                else {
                    users_cp866.append(users_string.charAt(i));
                    users_cp866.append(counter);
                    counter = 1;
                }
            }
            
            
        }
        if (users_string.charAt(users_string.length()-1)!=users_string.charAt(users_string.length()-2)) {
            users_cp866.append(users_string.charAt(users_string.length()-1));   
        }
        else {
            users_cp866.append(users_string.charAt(users_string.length()-1));
        }
        return users_cp866.toString();
    }
}

