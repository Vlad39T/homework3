package Homework16;

public class Assignment extends Employee {
    int number;
    int payment;
    double tax;
    int count;

    public Assignment(String name, String top, double tax, int number, int payment) {
        super(name, top, tax);
        this.number = number;
        this.payment = payment;
        this.tax = tax;
    }

    public int sum() {
        this.count = this.number * this.payment;
        return this.count;
    }

    public double payable() {
        double result = this.tax / 100 * this.count;
        double finish =this.count - result;
        return finish ;
    }
}
