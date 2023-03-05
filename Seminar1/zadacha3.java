// Дан массив nums = [3,2,2,3,4,3] и число val вводим с клавиатуры
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
// Ввод: 3
// Вывод: 2, 2, 4, 3, 3, 3

package Seminar1;

import java.util.Scanner;

public class zadacha3 {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3,4,3};
        int[] arr = new int[nums.length];
        int val = 3;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                arr[idx] = nums[i];
                idx++;
            } 
        }
        for (int i = idx; i < arr.length; i++) {
            arr[i] = val;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}


// Scanner n = new Scanner(System.in);
// System.out.print("Введите число: ");