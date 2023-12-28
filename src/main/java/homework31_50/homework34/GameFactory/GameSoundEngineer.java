package homework31_50.homework34.GameFactory;

public class GameSoundEngineer extends AbstractGameCompany {
    public GameSoundEngineer(GameDevelopers jobTitle, String name) {
        super(jobTitle, name);
    }


    public GameSoundEngineer() {
    }

    @Override
    void creat() {

    }

    @Override
    void whatDoesHeDo() {
        System.out.println("a specialist who accompanies game events with an appropriate sound sample.");
    }
}
