package homework3_30.Homework6;

import java.util.Arrays;

//Напишіть програму, яка перевіряє, чи всі значення елементів
//масиву однакові. Виведіть: Yes — якщо всі однакові, і No — якщо
//є хоч одна відмінність. Задайте та ініціалізуйте масив на nочатку програми.
public class Task03 {
    public static void main(String[] args) {
        int[] mas = new int[]{10, 9, 10, 10};
        int mas1 = mas[0];
        boolean b = false;
        for (int i = 0 ; i < mas.length; i++) {
            if (mas1 == mas[i]) {
               b = true;

            } else {
                b = false;
                break;
            }
        }
        if (b==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
