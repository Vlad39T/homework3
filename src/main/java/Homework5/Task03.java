package Homework5;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір прямокутника");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a-1 ) {
                    System.out.print("* ");
                } else if (j == b-1  || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }System.out.println("");
        }

    }
}
