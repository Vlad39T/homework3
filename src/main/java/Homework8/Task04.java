package Homework8;
 import java.util.Scanner;
//Користувач вводить з клавіатури рядок. Перевірте, чи є введений
//        рядок паліндромом. Паліндроми — слова, речення або текст, які
//        однаково читаються як зліва направо, так і справа наліво.
//        Наприклад: кок; козак з казок; радар; а мене нема.

public class Task04 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Введіть рядок , щоб перевірити паліндром чи ні");
        String pen = sc.nextLine().toLowerCase().replaceAll("[!,.?   /''-_]","");
        StringBuffer mirr = new StringBuffer(pen);
        mirr.reverse();
        if (pen.contains(mirr)){
            System.out.println("Введений рядой паліндром");
        }else {
            System.out.println("Введений рядок не паліндром");
        }


    }
}
