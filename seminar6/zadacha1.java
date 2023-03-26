import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.
public class zadacha1 {
    public static void main(String[] args) {
        // LinkedHashSet<Integer> users = newSet();
        // printSet(users);
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(set);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(30000);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5000);
        treeSet.add(6);
        treeSet.add(3);

        System.out.println(treeSet);
    }

    // public static LinkedHashSet<Integer> newSet() {
    //     LinkedHashSet<Integer> res = new LinkedHashSet<>();
    //     int [] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
    //     for (int i = 0; i < arr.length; i++) {
    //         res.add(arr[i]);  
    //     }
    //     return res;
    // }

    // public static void printSet (LinkedHashSet<Integer> set) {
    //     System.out.println(set.toString());
    // } 
}
