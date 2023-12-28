package homework31_50.homework34.GameFactory;

public abstract class AbstractGameCompany {
    GameDevelopers jobTitle;
    String name;

    public AbstractGameCompany(GameDevelopers jobTitle, String name) {
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public AbstractGameCompany() {
    }
    abstract  void creat();
    abstract void whatDoesHeDo();
}
