// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class zadacha1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arr.add(0, i);
        }
    long time2 = System.currentTimeMillis();
    int result = (int)(time2 - time);
    System.out.println("time is: " + result + " ms");

    LinkedList<Integer> list = new LinkedList<Integer>();
    long timeList = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
        list.add(0, i);
    }
    long timeList2 = System.currentTimeMillis();
    int resultList = (int)(timeList2 - timeList);
    System.out.println("time is: " + resultList + " ms");

    }
}
