package Homework17;

//Завдання 2
//        Створіть клас ліхтарика (Flashlight).
//        Додайте в клас ліхтарика:
//         методи ввімкнення void on() та void off()для вимкнення ліхтарика;
//         метод, що перевіряє стан ліхтарика boolean isLight();
//         поле класу private boolean light, що зберігає поточний стан ліхтарика;
//         реалізувати алгоритм ввімкнення і вимкнення ліхтарика.
//        Завдання 3
//        Створіть клас для китайської батарейки ChinaBattery.
//        Додайте в клас батарейки:
//         поле класу для зберігання поточного заряду private int charge;
//         метод, що зменшує заряд батарейки boolean charge(); повертає істину, якщо заряд вдалося зменшити, і хибність, якщо батарейка розряджена.
//        Додайте до класу ліхтарика властивість класу з типом батарейки:
//private ChinaBattery battery = new ChinaBattery();
//        Додайте використання батарейки в методі ввімкнення ліхтарика.
public class ChinaBattery implements Battery {
    private int charge;

    public ChinaBattery() {
        this.charge = 100;
    }


    public boolean batcharge()  {

        if (charge > 0) {
                charge--;
            return true;
        }else {
            return false;
        }
    }

    public int getCharge() {
        return charge;
    }
}
