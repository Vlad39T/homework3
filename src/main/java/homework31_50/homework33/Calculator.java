package homework31_50.homework33;

//Створіть клас «Калькулятор». Реалізуйте клас з такою
//функціональністю:
//•Максимум з двох чисел.
//•Мінімум з двох чисел.
//•Відсоток числа.
//•Піднесення числа до степеня.
//Протестуйте всі можливості створеного класу з використанням JUnit.
public class Calculator {

    public int max(int one,int two){
        return Math.max(one,two);
    }

    public int min(int one,int two){
        return Math.min(one,two);
    }

    public float procent(float one, float procent){
        return (one*procent)/100;
    }

    public float degree(float one, float two){
        return (float) Math.pow(one,two);
    }
}
