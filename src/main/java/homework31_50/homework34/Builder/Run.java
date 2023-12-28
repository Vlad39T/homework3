package homework31_50.homework34.Builder;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        LevelBuilder lvl1 = new LevelOne();
        LevelDesigner designer = new LevelDesigner(lvl1);
        designer.constructGameLevel();

        GameLevel gameLevel= designer.getGameLevel();
        System.out.println(gameLevel );

    }
}
