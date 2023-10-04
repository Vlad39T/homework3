package Homework3;

import java.util.Scanner;

public class Task01 {


// Напишіть програму, яка пропонує користувачу ввести з
// клавіатури номер дня тижня, і у відповідь показує назву цього
// дня (наприклад, 6 — субота). Розв'яжіть завдання з
//використанням switch

    public static void main (String[] args ){

    Scanner sc = new Scanner(System.in);

        System.out.println("Введіть номер дня тижня , щоб дізнатися його назву");

        int ch = sc.nextInt();

        switch (ch){
            case 1 -> System.out.println("1 - Понеділок");
            case 2 -> System.out.println("2 - Вівторок");
            case 3 -> System.out.println("3 - Среда");
            case 4 -> System.out.println("4 - Четверг ");
            case 5 -> System.out.println("5 - П`ятниця");
            case 6 -> System.out.println("6 - Субота");
            case 7 -> System.out.println("7 - Неділя");
            default -> System.out.println("Під цим номером немає дня тижню");
        }

    }
}
