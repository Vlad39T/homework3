package homework3_30.Homework13;

import java.util.Random;
import java.util.Scanner;

//Завдання 6
//        Створіть квадратний масив розмірності n заповнений
//        випадковими числами. Виведіть масив на екран у вигляді
//        таблиці. Знайдіть найменший і найбільший елементи масивуі
//        виведіть їх на екран (якщо знайдено кілька однаковихелементів
//        — виведіть індекси рядка та стовпця, де є повторення). Виведіть
//        на екран час виконання пошуку в мілісекундах. Розмірність
//        масиву має задаватися з клавіатури.
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String pro = "";
        System.out.println("Введіть розмір квадратного масиву");
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = -1;
        int index1 = -1;
        int num = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10, 100);//якщо меньше 10 , то масив не рівний
                System.out.print(arr[i][j] + " ");
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
        long start =  System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!pro.contains(String.valueOf(arr[i][j]))) {
                    for (int k = 0; k < arr.length; k++) {
                        for (int z = 0; z < arr[k].length; z++) {
                            if (arr[i][j] == arr[k][z]) {
                                count++;
                                pro += String.valueOf(arr[i][j]);
                            }
                        }
                    }
                } else {
                    continue;
                }
                if (count > 1) {
                    index = i;
                    index1 = j;
                    num = arr[i][j];
                    System.out.println("Число " + num + " повторно зустричається в " + index + " рядку  " + index1 + " стовпчику");
                }
                count = 0;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Час виконання пошуку в мілісекундах " + (end-start));
    }
}