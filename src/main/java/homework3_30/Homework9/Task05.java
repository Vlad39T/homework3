package homework3_30.Homework9;

import java.util.Arrays;
import java.util.Scanner;
//Введіть рядок з клавіатури. Врядку мають бути слова, які можуть
//        бути роздільні пробілами або двокрапками. Обчисліть кількість
//        слів в рядку, в яких парна кількість літер


public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String ryadok = scanner.nextLine();
        String[] cut = ryadok.split("[\\s:]");
        int count = 0;
        for (String i : cut) {
            if (i.length() % 2 == 0) {
                count++;
            }
        }
        System.out.println("Слів з парними літерами = " +count);
    }
}

