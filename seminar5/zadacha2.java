// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны,
// если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом:
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

package seminar5;

import java.util.HashMap;
import java.util.Map;

public class zadacha2 {
    public static void main(String[] args) {
        String s = "peper";
        String k = "title";
        System.out.println(is_isomorthe(s, k));
    }

    public static boolean is_isomorthe (String st, String kt) {
        Map <Character, Character> isomor = new HashMap<>();
        if (st.length()!= kt.length()) {
            return false;
        }
        for (int i = 0; i < st.length(); i++) {
            if (!isomor.containsKey(st.charAt(i))) {
                isomor.putIfAbsent(st.charAt(i), kt.charAt(i));
            }
            else {
                if (isomor.get(st.charAt(i)) != kt.charAt(i)) {
                    return false;
                }
            }
        }
        Map <Character, Character> isomor_reverse = new HashMap<>();
        for (int i = 0; i < kt.length(); i++) {
            if (!isomor_reverse.containsKey(kt.charAt(i))) {
                isomor_reverse.putIfAbsent(kt.charAt(i), st.charAt(i));
            }
            else {
                if (isomor_reverse.get(kt.charAt(i)) != st.charAt(i)) {
                    return false;
                }
            }
        }
        return true; 
    }    
}

