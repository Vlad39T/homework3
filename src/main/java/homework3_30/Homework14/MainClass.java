package homework3_30.Homework14;
//Створіть програму, яка дозволяє ввести з клавіатури n
//        діапазонів цілочислових значень (наприклад, 3-10). Кожен
//        діапазон має початкову і кінцеву точку.Після введення, програма
//        має вивести довжину кожного діапазону. Програма має
//        виводити повідомлення про помилку, якщо початок діапазону
//        більший, ніж його кінець. Протестуйте звикористанням JUnit.
//        Приклад:
//        Введені дані: 3 9, -2 4, 11 15
//        Виведені дані: 3, 6, 4
//До завдання 1 додайте можливість перевірки, чи
//перетинаються різні діапазони значень.


import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість діапазонів ");
        int n = sc.nextInt();
        Range[] one = new Range[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введіть х ");
            int x = sc.nextInt();
            System.out.println("Введіть у ");
            int y = sc.nextInt();
            if (x > y) {
                System.out.println("Не вірний діапазон - початок (" + x + ") більше кінця (" + y + ")");
                break;
            }
            one[i] = new Range(x, y);
            System.out.println(one[i]);
            int length = y - x;
            System.out.println("Довжина діапазону = " + length);
        }
        if (one[0].Examination(one[1])){
            System.out.println("Перетинаються");
        }else {
            System.out.println("Не перетинаються");
        }
    }
}
