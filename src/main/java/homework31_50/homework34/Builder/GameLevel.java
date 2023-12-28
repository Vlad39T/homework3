package homework31_50.homework34.Builder;

public class GameLevel implements LevelPlan {
    @Override
    public void setSettlements(String settlements) {
        System.out.println("Населенні пункти -" + settlements);
    }

    @Override
    public void setNPS(String nps) {
        System.out.println("Персонажі - " + nps);
    }

    @Override
    public void setMissions(String missions) {
        System.out.println("Місії - " + missions);
    }

    @Override
    public void setArea(String area) {
        System.out.println("Параметри карти - " + area);
    }

    @Override
    public void setName(String name) {
        System.out.println("Назва рівню - " + name);
    }
}
