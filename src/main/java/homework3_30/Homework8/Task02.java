package homework3_30.Homework8;

import java.util.Scanner;
//Напишіть програму, яка створить рядок, в якому знаходяться всі
//        цілі числа, починаючи з 1, виписані в один рядок
//        «123456789101112131415...». Рядок має бути довжиною не
//        більше 1 000 символів.
//        За числом n (введеного з клавіатури), виведіть цифру на
//        n-й позиції (використовується нумерація з 1).

public class Task02 {
    public static void main(String[] args) {
        String num = "";
        int a = 1;
        while (num.length()<1000){
            num = num+(a + "");
            a++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть позицию для вивода ");
        int cap = sc.nextInt();
        String sub = num.substring(0,1000);
        char mass = sub.charAt(cap -1);
        System.out.println("Цифра на поції " + cap + " ==== " + mass);
    }
}
