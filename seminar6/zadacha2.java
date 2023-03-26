import java.util.HashSet;

// Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.
public class zadacha2 {
    public static void main(String[] args) {
        HashSet<Integer> userSet = newSet();
        printSet(userSet);
    }

    public static HashSet<Integer> newSet() {
        HashSet<Integer> res = new HashSet<>();
        int [] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[i]);  
        }
        return res;
    }

    public static void printSet (HashSet<Integer> set) {
        System.out.println(set.toString());
    } 
}
