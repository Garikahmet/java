// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package Seminar2.homework;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class zadacha1 {
    public static void main(String[] args) {
         Integer n = 1;
        String file_name = "1.txt";
        File file = new File(file_name);
        
        int[] arr = new int[] { 3, 5, 1, 9, 4, 3, 7 };
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }  
            }

            try{
                FileWriter writer = new FileWriter(file,true);
                 for (int s = 0; s < n; s++){
                writer.write(Arrays.toString(arr));
                writer.write("\n");
                }
                writer.close();
                System.out.println("Получилось!)");
                }
                catch (Exception e){
                System.out.println("Что то пошло не так");
                }   
        }
    }
    
}
