package homework29;

import java.util.Arrays;
import java.util.Scanner;

//Завдання 2: Користувач з клавіатури вводить значення масив, після чого запускаються два потоки.
//        Перший потік знаходить суму елементів в масиві.
//        Другий потік знаходить середнє арифметичне в масиві. Результати обчислень повертаються у метод main.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір массиву");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введіть елемент массиву");
            count = sc.nextInt();
            arr[i] = count;
        }
        System.out.println("Отриманий масив = " + Arrays.toString(arr));
        Sum sum = new Sum(arr);
        Avarege av = new Avarege(arr);

        av.start();
        sum.start();
    }

}
