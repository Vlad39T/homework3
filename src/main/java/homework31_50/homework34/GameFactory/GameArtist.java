package homework31_50.homework34.GameFactory;

public class GameArtist extends AbstractGameCompany{
    public GameArtist(GameDevelopers jobTitle, String name) {
        super(jobTitle, name);
    }

    public GameArtist() {
    }

    @Override
    void creat() {

    }

    @Override
    void whatDoesHeDo() {
        System.out.println("Creates textures and characters ");
    }
}
