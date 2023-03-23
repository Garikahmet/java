// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package seminar5.Homework;

import java.util.ArrayList;

public class zadacha2 {

    public void m() {

        ArrayListMultimap<String, String> map = ArrayList.create();
        map.put("Иван", "Иванов");
        map.put("Светлана", "Петрова");
        map.put("Кристина", "Белова");
        map.put("Анна", "Мусина");
        map.put("Анна", "Крутова");
        map.put("Иван", "Юрин");
        map.put("Петр", "Лыков");
        map.put("Павел", "Чернов");
        map.put("Петр", "Чернышов");
        map.put("Марина", "Светлова");
        map.put("Мария", "Савина");
        map.put("Мария", "Рыкова");
        map.put("Марина", "Лугова");
        map.put("Анна", "Владимирова");
        map.put("Иван", "Мечников");
        map.put("Петр", "Петин");
        map.put("Иван", "Ежов");

        String s = (map.keys().toString()).replace("[", "");
        String s1 = s.replace("]", "");
        String[] arr = s1.split(",");

        ArrayList<String> list = new ArrayList<>();
        String temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                temp = j + "";
                if (arr[i].contains(temp)) {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
    