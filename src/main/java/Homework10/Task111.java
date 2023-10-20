package Homework10;

import java.util.Arrays;
import java.util.Scanner;

//Напишіть програму, яка перевіряє, чи є один рядок анаграмою
//        для іншого рядка (рядок може складатися з кількох слів і
//        символів пунктуації). Ігноруйте пробіли і пунктуацію під час
//        аналізу. Різниця у великих і маленьких літерах має ігноруватися.
//        Обидва рядка мають вводитися з клавіатури. Програма має
//        виводити Yes, якщо рядки є анаграмою, і No — якщо навпаки.
//        Приклад анаграми у віршах:
//        Рядок 1 “Я не лев!” – левеня;
//        Рядок 2 “Я не лис!” – лисеня.
public class Task111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перший рядок ");
        String one = sc.nextLine().toLowerCase().replaceAll("\\p{IsPunctuation}", "").replace(" ", "");
        System.out.println("Введіть другий рядок ");
        String two = sc.nextLine().toLowerCase().replaceAll("\\p{IsPunctuation}", "").replace(" ", "");
        int lit = 0;
        int let = 0;
        for (char i : one.toCharArray()) {
            lit+=i;
        }
        for(char j:two.toCharArray()){
            let+=j;
        }
        if (lit == let) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
