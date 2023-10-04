package Homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        Користувач вводить з клавіатури деякі числа (a, b, c),
//        вивести на екран всі числа які є одночасно кратними числам (a, b, c) з діапазону від 0 до 100000.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть три числа");
        System.out.println("Введіть а");
        int a = sc.nextInt();
        System.out.println("Введіть b");
        int b = sc.nextInt();
        System.out.println("Введіть c");
        int c = sc.nextInt();

        int st = 0;
        int fh = 100000;

        for (int i = st; i <= fh; i++) {


            if (i % a == 0 && i % b == 0 && i % c == 00) {

                System.out.println(i);

            }


        }


    }
}
