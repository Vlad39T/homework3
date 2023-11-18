package Homework18;

import java.text.DecimalFormat;

public class Student<T,T1,S,V,Z> {
    T surname;
    T1 birthday;
    S bal1;
    V bal2;
    Z bal3;
    int average;
    public Student() {
    }

    public Student(T surname, T1 birthday, S bal1, V bal2, Z bal3) {
        this.surname = surname;
        this.birthday = birthday;
        this.bal1 = bal1;
        this.bal2 = bal2;
        this.bal3 = bal3;
    }
    @Override
    public String toString() {
        return "Прізвище:" + surname +
                "\nДень народження:" + birthday +
                "\nБал1:" + bal1 +
                "\nБал2:" + bal2 +
                "\nБал3:" + bal3 +
                "\nСредній бал:"+gpa.averageBal();

    }
     class Assessment implements SolutionMethods {
        @Override
        public double averageBal() {

            int i=(int)bal1;
            int a=(int)bal2;
            int b=(int)bal3;
            double sred =(double) (i+a+b)/3*10;
            int j =(int) sred;
            double sred1 = (double) j/10;
            return sred1;
        }
    }

    Assessment gpa = new Assessment();

}
