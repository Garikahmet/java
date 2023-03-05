// Вывести все простые числа от 1 до 1000

package Seminar1.Homework;

public class zadacha2 {
    public static void main(String[] args) {
        int i,j;
    	for (i = 2; i < 1000; i++) {
            int k = 0;
    		for (j = 2; j <= i; j++) {
    			if ((i % j) == 0)
                k++;
    		}
            if (k < 2)
    		System.out.println(i);
            
        }
   
        }

    }


