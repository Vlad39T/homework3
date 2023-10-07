package Homework5;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір квадрату");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print("* ");
                } else if (j == a - 1 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }System.out.println("");
        }

    }

}


