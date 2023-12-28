package homework31_50.homework34.GameFactory;

public class GameProgrammer extends AbstractGameCompany {
    public GameProgrammer(GameDevelopers jobTitle, String name) {
        super(jobTitle, name);
    }

    public GameProgrammer() {
    }

    @Override
    void creat() {

    }

    @Override
    void whatDoesHeDo() {
        System.out.println("writes code to bring characters to life, create visual effects and user interface," +
                " and integrate sound and event sequences");
    }
}
