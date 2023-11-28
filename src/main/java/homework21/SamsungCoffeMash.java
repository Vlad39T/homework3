package homework21;

public class SamsungCoffeMash extends CoffeeMachine {


    public SamsungCoffeMash() {
        super(3000, 700, 2400);
    }

    public SamsungCoffeMash(int maxWaterLevel, int maxCoffeeLevel, int maxGarbageLevel) {
        super(maxWaterLevel, maxCoffeeLevel, maxGarbageLevel);
    }
    @Override
    public void addWater() {
    }
    @Override
    public void addCoffee() {
    }
}
