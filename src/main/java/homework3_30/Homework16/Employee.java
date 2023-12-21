package homework3_30.Homework16;

public class Employee {
    String name;
    String top;//Type of payment
    double tax;


    public Employee(String name, String top,double tax ) {
        this.name = name;
        this.top = top;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }
    public double getTax() {
        return tax;
    }
}
