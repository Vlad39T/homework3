package homework3_30.Homework7;

import java.util.Random;

//Заповніть масив з 10 елементів випадковими числами від -10 до
//        +10. Підрахуйте кількість унікальних значень (що зустрічаються
//        в масиві один раз). Виведіть в консоль значення унікальних
//        елементів та індекси, під якими вони знаходяться в масиві.

public class Task06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[10];
        String num = "";
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-10, 11);
        }
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < mas.length; i++) {
            if (!num.contains(String.valueOf(mas[i]))) {
                for (int j = 0; j < mas.length; j++) {
                    if (mas[i] == mas[j]) {
                        count++;

                        num += String.valueOf(mas[i]);
                    }
                }
            } else {
                continue;
            }
            if(count ==1){
                int index = -1;
                count1++;
                int r = mas[i];
                index = i;
                System.out.println(r + " індекс = " + index);

            }
            count = 0;
        }
        System.out.print("Всього унікальних елементів " + count1);
    }
}
