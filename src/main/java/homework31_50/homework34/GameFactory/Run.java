package homework31_50.homework34.GameFactory;

public class Run {
    public static void main(String[] args) {
        GameCompany gameCompany = new GameCompany();
        AbstractGameCompany abstractGameCompany = gameCompany.creatGame(GameDevelopers.LEVEL_DESIGNER);
        abstractGameCompany.whatDoesHeDo();
    }

}
