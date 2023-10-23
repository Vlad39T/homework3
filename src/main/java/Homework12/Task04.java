package Homework12;
//Завдання 4. Цифри числа справа наліво
//        Дано натуральне число N. Виведіть всі його цифри по одній у
//        зворотному порядку через пробіл. Дозволена тільки рекурсія і
//        цілочислова арифметика.
//        Введення: 179
//        Виведення: 9 7 1

public class Task04 {
    public static void main(String[] args) {
        reverse(179);
    }

    public static void reverse(int number) {
        if (number == 0) {
            return;
        } else {
            int n = number % 10 ;
            System.out.print(n+ " ");
            reverse(number / 10);
        }
    }
}
