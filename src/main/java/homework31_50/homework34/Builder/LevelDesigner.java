package homework31_50.homework34.Builder;

public class LevelDesigner {
    public  LevelBuilder levelBuilder ;


    public LevelDesigner(LevelBuilder levelBuilder) {
        this.levelBuilder = levelBuilder;
    }

    public GameLevel getGameLevel(){
        return this.levelBuilder.getGameLevel();
    }
    public void constructGameLevel(){
        this.levelBuilder.levelSettlements();
        this.levelBuilder.levelNPS();
        this.levelBuilder.levelMissions();
        this.levelBuilder.levelArea();
        this.levelBuilder.levelName();


    }
}
