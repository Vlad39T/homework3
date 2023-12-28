package homework31_50.homework34.Builder;

public class LevelTwo implements LevelBuilder {
    private final GameLevel gameLevel;


    public LevelTwo() {
        this.gameLevel = new GameLevel();
    }

    @Override
    public void levelSettlements() {
        gameLevel.setSettlements("1 = small village\n" +
                "1 = forest\n" +
                "1 = beach\n" +
                "everything is connected by roads and paths, there are fields and lawns");
    }

    @Override
    public void levelNPS() {
        gameLevel.setNPS("1 = Salesperson and assistant\n" +
                "1 = peasants in the field\n" +
                "1 = construction team of 4-12 people\n" +
                "2 = pair of lumberjacks\n" +
                "2 = fishermen");
    }

    @Override
    public void levelMissions() {
        gameLevel.setMissions("1. Buy a tool.\n" +
                "2.talk to the peasants, find out the way to the sea.\n" +
                "3.Find a fisherman who needs help.\n" +
                "4.Help the fisherman.\n" +
                "5.Use the proceeds to buy a ticket to the capital.\n" +
                "6.Go to the capital.");
    }

    @Override
    public void levelArea() {
        gameLevel.setArea("island size = 2km:1.2km.\n" +
                "sea size around the island = 1km:1km");
    }

    @Override
    public void levelName() {
        gameLevel.setName("\n" +
                "the beginning of the way");
    }

    @Override
    public GameLevel getGameLevel() {
        return this.gameLevel;
    }
}
