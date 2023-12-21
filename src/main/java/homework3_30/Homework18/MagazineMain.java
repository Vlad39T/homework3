package homework3_30.Homework18;
//Программа должна выводить на экран список студентов группы, указывая в
//строчку через пробел фамилию, год рождения, три оценки и средний бал.
//Необходимо разработать систему классов для реализации программы. Для
//хранения информации о студенте создайте класс Student.
public class MagazineMain {
    public static void main(String[] args) {
        Student<String,String,Integer,Integer,Integer> st=new Student<>("Петренко","12.11.2007",7,9,10);
        System.out.println(st);
        Student<String,String,Integer,Integer,Integer> st1=new Student<>("Іваненко","07.04.2006",7,9,12);
        System.out.println(st1);
        Student<String,String,Integer,Integer,Integer> st2=new Student<>("Jack","28.07.2008",11,4,7);
        System.out.println(st2);
    }
}
