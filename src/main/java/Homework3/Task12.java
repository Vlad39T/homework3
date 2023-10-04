package Homework3;

import java.util.Scanner;

public class Task12 {

//    Програма запитує шестизначне число. Після введення програма
//    визначає, чи буде квиток з таким номером «щасливим» (сума
//    перших трьох цифр збігається із сумою трьох останніх цифр).
//    Приклад введених даних:
//            423027
//            954832
//    Вивід:
//    Так/Hi

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть 6-ти значний код вашого лотерейного білету , щоб дізнатися прищовий він чи ні");

        int loto = sc.nextInt();

        int a = loto/100000;//1
        int b = loto/ 10000 % 10;//2
        int c = loto % 10000 /1000;//3
        int sum1 = a+b+c;
        int a1 = loto %1000 / 100 ;//4
        int b1 = loto %100 / 10 ;//5
        int c1 = loto %10 ;//6
        int sum2 = a1 + b1 + c1 ;

        if(sum1==sum2){

            System.out.println("Так");

        }else {
            System.out.println("Ні");
        }



    }


}
