package homework3_30.Homework20;
//Завдання 2:
//        Створіть клас для розрахунку площі геометричних фігур. Клас
//        має надавати функціональність для підрахунку площі трикутника
//        за різними формулами, площі прямокутника, площі квадрата,
//        площі ромба. Методи класу для підрахунку площі реалізуйте за
//        допомогою статичних методів. Також клас має розрахувати
//        кількість підрахунків площі та повернути це значення статичним
//        методом.
//
//
//        Завдання 3:
//        Створіть клас для підрахунку максимуму з чотирьох аргументів,
//        мінімуму з чотирьох аргументів, середнє арифметичне із
//        чотирьох аргументів, факторіалу аргументу. Функціональність
//        треба реалізувати у вигляді статичних методів.
public class TaskMain {
    public static void main(String[] args) {
        System.out.println(Task02.rhombusArea(15, 30));
        System.out.println(Task02.triangleAreas(5,4));
        System.out.println(Task02.rectangeArea(10,7));
        System.out.println(Task02.squareArea(5));
        System.out.println(Task02.getCount());
        System.out.println(Task03.maxValue(5,6,80,45));
        System.out.println(Task03.minValue(5,6,80,45));
        System.out.println(Task03.average(11,8,81,45));
        System.out.println(Task03.factorial(5));
    }
}
