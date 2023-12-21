package homework3_30.homework28;
//Користувач вводить з клавіатури шлях до файлу, Після роботи
//        програми на екрані відображається кількість літер, чисел і
//        розділових знаків у файлі.

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть шлях до файлу");
        String tekst = sc.nextLine();

        String file = task04(tekst);
        String task = "";
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        while (index != -1) {
            index = file.indexOf("," , index + 1);
            count++;
        }
        while (index1!=-1) {
            index1 = file.indexOf(".", index1 + 1);
            count1++;
        }
        while (index2!=-1){
             index2=file.replaceAll("[0-9]","1").indexOf("1",index2+1);
            count2++;
        }

        task = file.replaceAll("[!,.? /''-_0-10\n\\s]", "");
        System.out.println("Кількість літер в тексті = " + task.length());
        System.out.println("Кількість розділових в тексті = " + (count+count1));
        System.out.println("Кількість чисел в тексті = "+count2 );
    }

    private static String task04(String fileName) {

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            char[] buf = new char[1024];
            int length = read.read(buf);
            return new String(buf, 0, length);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
