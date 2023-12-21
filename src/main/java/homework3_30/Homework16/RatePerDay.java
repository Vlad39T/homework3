package homework3_30.Homework16;

public class RatePerDay extends Employee {
    int numDay;//number of days
    int dRate;//Daily rate
    double tax;
    int count;

    public RatePerDay(String name, String top, double tax, int numDay, int dRate) {
        super(name, top , tax);
        this.numDay = numDay;
        this.dRate = dRate;
        this.tax=tax;
    }

    public int sum() {
        this.count = this.numDay * this.dRate;
        return this.count;
    }

    public double payable() {
        double result = this.tax / 100 * this.count;
        double finish =this.count - result;
        return finish ;
    }
}
