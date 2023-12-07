package homework2526.view;

import homework2526.servece.Metods;

import java.util.Scanner;

public class Menu {
    private int num;

    public Menu(int num) {
        this.num = num;
    }

    public Menu() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num >= 0 && num <= 11) {
            this.num = num;
        } else {
            System.out.println("Помилка вводу");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть операцію");
        Metods metods = new Metods();
        boolean exit = true;
        while (exit) {
            System.out.println("1 Надати початкове введення даних для словника.");
            System.out.println("2 Відобразити слово та його переклади.");
            System.out.println("3 Додати переклад слова.");
            System.out.println("4 Змінити переклад слова.");
            System.out.println("5 Видалити переклад слова.");
            System.out.println("6 Додати слово.");
            System.out.println("7 Змінити слово.");
            System.out.println("8 Видалити слово.");
            System.out.println("9 Відобразити топ-10 найпопулярніших слів.");
            System.out.println("10 Відобразити топ-10 найнепопулярніших слів.");
            System.out.println("11 Відобразити весь словник.");
            System.out.println("0 Вихід.");


            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1 -> {
                    System.out.println("Введіть слово на англійській мові");
                    String word = scanner.next();
                    System.out.println("Введіть український переклад");
                    String translate = scanner.next();
                    metods.add(word, translate);
                }
                case 2 -> {
                    System.out.println("Введіть слово для перекладу");
                    String word = scanner.nextLine();
                    metods.show(word);
                }
                case 3 -> {
                    System.out.println("Введіть слово на англійській мові, до якого треба додати переклад");
                    String word = scanner.next();
                    System.out.println("Введіть слово-переклад, який потрібно додати");
                    String addT = scanner.next();
                    metods.addTranslation(word, addT);
                }
                case 4 -> {
                    System.out.println("Введіть слово на англійські мові, у якого потрібно змінити переклад");
                    String word = scanner.next();
                    System.out.println("Введіть старе слово, яке потрібно змінити");
                    String oldT=scanner.next();
                    System.out.println("Введіть нове слово-переклад");
                    String newT=scanner.next();
                    metods.changeTranslation(word,oldT,newT);
                }
                case 5->{
                    System.out.println("Введіть англійське слово до якого треба відалити переклад");
                    String word = scanner.next();
                    System.out.println("Введіть переклад який потрібно видалити");
                    String delete = scanner.next();
                    metods.deleteTranslation(word,delete);
                }
                case 6->{
                    System.out.println("Введіть слово на англійській мові, щоб додати ще одне значення для перекладу");
                    String addW=scanner.next();
                    metods.addWord(addW);
                }
                case 7->{
                    System.out.println("Введіть слово на англійській мові, яке потрібно змінити");
                    String change = scanner.next();
                    System.out.println("Введіть нове слово на англійській мові");
                    String newW=scanner.next();
                    metods.changeWord(change,newW);
                }
                case 8->{
                    System.out.println("Введіть слово на англійські мові, яке потрібно видалити");
                    String delete=scanner.next();
                    metods.deleteWord(delete);
                }
                case 9->{
                    System.out.println("Топ-10 найпопулярніших слів");
                    metods.top10up();
                }
                case 10-> {
                    System.out.println("Топ-10 найнепопулярніших слів");
                    metods.top10down();
                }
                case 11->metods.showDictionary();
                case 0->{
                    System.out.println("Программа закривається");
                    exit=false;
                }
            }
        }
    }
}
