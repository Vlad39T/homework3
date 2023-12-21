package homework3_30.Homework4;

import java.util.Scanner;

//2)	Напишіть програму, яка перевірятиме, чи є введене число з клавіатури, паліндромом
// (яке можна однаково прочитати в обох напрямках). Наприклад,
// 123454321 або 221122 — паліндром. Програма має вивести YES, якщо число є паліндромом, і NO якщо число не паліндром.

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int pal = sc.nextInt();

        boolean b = false;

        String palindrom = String.valueOf(pal);

        for (int i = 0, j = palindrom.length() - 1; i < j; i++, j--) {
            if (palindrom.charAt(i) == palindrom.charAt(j)) {
                b = true;
            } else {
                b = false;
                break;
            }
        }


        if (b == true) {
                System.out.println("palindrom");
            } else {
                System.out.println("Not palindrom");
        }



    }
}

