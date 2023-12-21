package homework3_30.Homework7;

import java.util.Random;

public class Task05 {
    //Завдання 5
    //Заповніть масив з 10 елементів випадковими числами від -10 до
    //+10. Підрахуйте кількість повторюваних значень. Виведіть в
    //консоль тільки повторювані елементи і кількість повторень.
    //Приклад:
    //0 – 5 разів
    //2 – 3 рази
    //7 – 1 разів
    public static void main(String[] args) {
        int[] mas = new int[10];
        Random random = new Random();
        String num = "";
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-10, 11);
        }
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (!num.contains(String.valueOf(mas[i]))) {
                for (int j = 0; j < mas.length; j++) {
                    if (mas[i] == mas[j]) {
                        count++;
                        num += String.valueOf(mas[i]);
                    }
                }
            } else {
                continue;
            }
            System.out.println(mas[i] + " Зустрічається = " + count + " разів");
            count = 0;
        }
    }
}