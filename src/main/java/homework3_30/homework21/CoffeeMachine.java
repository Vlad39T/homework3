package homework3_30.homework21;

public abstract class CoffeeMachine implements CoffeeMashInterface {
    private int maxWaterLevel;
    private int maxCoffeeLevel;
    private int maxGarbageLevel;

    private int currentWaterLevel;
    private int currentCoffeeLevel;
    private int currentGarbageLevel;

    protected CoffeeMachine() {
    }

    public boolean checkWaterLevel(int currentWaterLevel) {
        return this.currentWaterLevel > 0;
    }

    public boolean checkCoffeeLevel(int currentCoffeeLevel) {
        return currentCoffeeLevel > 0;
    }

    public boolean checkGarbageLevel() {
        return currentGarbageLevel > 0;
    }


    public CoffeeMachine(int maxWaterLevel, int maxCoffeeLevel, int maxGarbageLevel) {
        this.maxWaterLevel = maxWaterLevel;
        this.maxCoffeeLevel = maxCoffeeLevel;
        this.maxGarbageLevel = maxGarbageLevel;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }


    @Override
    public void makeEspresso() {
        if(currentWaterLevel<=22) {
            System.out.println("Відсутня вода");
        }
        if(currentCoffeeLevel<=30) {
            System.out.println("Відсутня кава");
        }
        currentCoffeeLevel -= 22;
        currentWaterLevel -= 30;
    }

    @Override
    public void makeAmericano() {
        if(currentWaterLevel<=22) {
            System.out.println("Відсутня вода");
        }
        if(currentCoffeeLevel<=100) {
            System.out.println("Відсутня кава");
        }
        currentCoffeeLevel -= 22;
        currentWaterLevel -= 100;
    }

    @Override
    public void cleanGarbageBox() {

    }

    @Override
    public void addCoffee(int amount){
        if (currentCoffeeLevel + amount<= maxCoffeeLevel){
            currentCoffeeLevel+=amount;
        }else{
            System.out.println("Додано забагато кави");
        }
    }

    @Override
    public void addWater(int quantity){
        if (currentWaterLevel + quantity<= maxWaterLevel){
            currentWaterLevel+=quantity;
        }else{
            System.out.println("Додано забагато води");
        }
    }

    public abstract void addWater();

    public abstract void addCoffee();
}



