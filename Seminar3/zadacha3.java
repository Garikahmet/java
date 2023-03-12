// Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Random;

public class zadacha3 {
    public static void main(String[] args) {
        // решение 1
        // ArrayList mixed_list = new ArrayList<>();
        // String[] words = new String[] {"aaa","rrrr", "fhgfdfg", "yyttgg"};
        // Random rdm = new Random();
        // for (int i = 0; i < 20; i++) {
        //     int type = rdm.nextInt(0, 2);
        //     if (type == 0) {
        //         mixed_list.add(rdm.nextInt(1, 10));
        //     }
        //     else {
        //         mixed_list.add(words[rdm.nextInt(words.length)]);
        //     } 
        // }
        // System.out.println(mixed_list);

        // int length = mixed_list.size();
        // for (int i = 0; i < length; i++) {
        //     if (mixed_list.get(i) instanceof Integer) {
        //      mixed_list.remove(i);
        //     length --;
        //     i--;
        //     }
        // } 
        // System.out.println(mixed_list);
    
    // решение 2
        // ArrayList arrLst = new ArrayList<>(Arrays.asList("propety1",59,"propety1",1.62,"propety1","propety2",8,"propety5"));
        // System.out.println(arrLst);
        // int i = 0;
        // while (i < arrLst.size()) {
        //     if (arrLst.get(i) instanceof Integer) {
        //         arrLst.remove(i);
        //     }
        //     else i++;
        // }
        // System.out.println(arrLst);  

    // решение 3

        ArrayList arrLst = new ArrayList<>(Arrays.asList("propety1",59,"propety1","propety1","propety2",8,"propety5"));
        for (int i = arrLst.size() - 1; i >= 0; i--) {
            if (arrLst.get(i) instanceof Integer) {
                arrLst.remove(i);
            }
        }
        System.out.println(arrLst);
    }
}

