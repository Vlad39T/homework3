package homework3_30.Homework17;

public class Flashlight implements Flash {
    private boolean light;
    private ChinaBattery battery = new ChinaBattery();

    @Override
    public void on() {
        if (battery.batcharge()) {
            System.out.println("Ліхтарик увімкнено \n залишилося зарядку " + battery.getCharge() + "%");
            light=true;
        }else {
            light=false;
        }
    }

    @Override
    public void off() {
        if (!isLight()) {
            System.out.println("Ліхтарик вимкнутий");
        }
    }

    @Override
    public boolean isLight() {
        return light;
    }
}
