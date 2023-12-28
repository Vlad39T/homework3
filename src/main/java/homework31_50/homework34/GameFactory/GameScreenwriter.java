package homework31_50.homework34.GameFactory;

public class GameScreenwriter extends AbstractGameCompany{
    public GameScreenwriter(GameDevelopers jobTitle, String name) {
        super(jobTitle, name);
    }

    public GameScreenwriter() {
    }

    @Override
    void creat() {

    }

    @Override
    void whatDoesHeDo() {
        System.out.println("A video game writer creates game universes and settings in different genres. " +
                "Thinks through the plot, characters and writes dialogues.");
    }
}
