package Homework16;

public class RatePerHour extends  Employee{
    int numHours ;//Number of hours
    int hRate;//hourly rate
    double tax;
    int count;


    public RatePerHour(String name, String top, double tax, int numHours, int hRate) {
        super(name, top , tax);
        this.numHours = numHours;
        this.hRate = hRate;
        this.tax = tax;
    }

    public int sum(){
        this.count = this.numHours*this.hRate;
        return this.count;
    }
    public double payable() {
        double result = this.tax / 100 * this.count;
        double finish =this.count - result;
        return finish ;
    }
}
