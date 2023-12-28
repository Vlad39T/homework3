package homework31_50.homework34.Builder;

public class LevelOne implements LevelBuilder {
    private final GameLevel gameLevel;

    public LevelOne() {
        this.gameLevel = new GameLevel();
    }

    @Override
    public void levelSettlements() {
        gameLevel.setSettlements("1 mini training island\n" +
                "3 real event simulator locations");
    }

    @Override
    public void levelNPS() {
        gameLevel.setNPS("voice in the background");
    }

    @Override
    public void levelMissions() {
        gameLevel.setMissions("skills development and management training");
    }

    @Override
    public void levelArea() {
        gameLevel.setArea("polygon = 1 km:600 m\n" +
                "simulators = 300m:200m");
    }

    @Override
    public void levelName() {
        gameLevel.setName("training");
    }

    @Override
    public GameLevel getGameLevel() {
        return this.gameLevel;
    }
}
