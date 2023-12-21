package homework3_30.homework23;

import java.util.*;

//Завдання 2:
// Розробіть додаток, який дозволяє зберігати інформацію про логіни і паролі користувачів.
// Кожному користувачу відповідає пара "логін — пароль".
// При старті додатку відображається меню:
// 1. Додати нового користувача.
// 2. Видалити існуючого користувача.
// 3. Перевірити, чи існує такий користувач.
// 4. Змінити логін існуючого користувача.
// 5. Змінити пароль існуючого користувача.
// Дія виконується залежно від вибору користувача,
// після чого меню з'являється знову.
// Для вирішення завдання використовуйте відповідний клас з Java Collections Framework.
public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть дію");
        List<User> users = new ArrayList<>();
        users.add(new User("Kolya2021", "QWERTY1209"));

        while (true) {
            System.out.println("1 Додати нового користувача.");
            System.out.println("2 Видалити існуючого користувача.");
            System.out.println("3 Перевірити, чи існує такий користувач.");
            System.out.println("4 Змінити логін існуючого користувача.");
            System.out.println("5 Змінити пароль існуючого користувача.");
            System.out.println("6 Показати всіх користувачів.");
            System.out.println("0 Вихід.");


            int choice = scanner.nextInt();
            boolean check = true;
            switch (choice) {
                case 1 -> add(users, scanner);
                case 2 -> remove(users, scanner);
                case 3 -> check(users, scanner);
                case 4 -> changeLogin(users, scanner);
                case 5 -> changePassword(users, scanner);
                case 6 -> show(users);
                case 0 -> {
                    System.out.println("До побачення");
                    check = false;
                    ;
                }
                default -> System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");
            }
        }
    }

    private void check(List<User> list, Scanner scanner) {
        System.out.println("Введіть логін користувача, якого потрібно перевірити");
        String login = scanner.next();

        for (User user : list) {
            if (user.getLogin().equals(login)) {
                System.out.println("Такий користувач вже існує.");
            } else {
                System.out.println("Не існує.");
            }
            return;
        }
    }

    private void add(List<User> list, Scanner scanner) {
        System.out.println("Додати нового користувача ");
        System.out.print("Введіть логін: ");
        String login = scanner.next();

        System.out.print("Введіть пароль: ");
        String password = scanner.next();

        User newUser = new User(login, password);
        list.add(newUser);

    }

    private void show(List<User> list) {
        for (User u : list) {
            System.out.println("Login = " + u.getLogin() + " Password = " + u.getPassword());
        }
    }

    private void changePassword(List<User> list, Scanner scanner) {
        System.out.println("Введіть логін користувача, який потрібно змінити");
        String login = scanner.next();
        System.out.println("Введіть новий пароль");
        String newPassword = scanner.next();
        for (User user : list) {
            if (user.getLogin().equals(login)) {
                user.setPassword(newPassword);
                return;
            }
        }
    }

    private void changeLogin(List<User> list, Scanner scanner) {
        System.out.println("Введіть логін користувача, який потрібно змінити");
        String login = scanner.next();
        System.out.println("Введіть новий логін");
        String newLogin = scanner.next();
        for (User user : list) {
            if (user.getLogin().equals(login)) {
                user.setLogin(newLogin);
                return;
            }
        }
    }

    private void remove(List<User> list, Scanner scanner) {
        System.out.println("Щоб видалити існуючого користувача,Введіть логін ");
        list.removeIf(user -> user.getLogin().equals(scanner.next()));
    }
}
