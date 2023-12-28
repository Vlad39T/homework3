package homework31_50.homework34.GameFactory;

public class GameLevelDesigner extends AbstractGameCompany{
    public GameLevelDesigner(GameDevelopers jobTitle, String name) {
        super(jobTitle, name);
    }

    public GameLevelDesigner() {
    }

    @Override
    void creat() {

    }

    @Override
    void whatDoesHeDo() {
        System.out.println("creating levels for games - locations, missions, tasks and other environments.");
    }
}
