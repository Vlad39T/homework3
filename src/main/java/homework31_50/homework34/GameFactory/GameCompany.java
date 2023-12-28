package homework31_50.homework34.GameFactory;

public class GameCompany {
    AbstractGameCompany gameCompany;

    public AbstractGameCompany creatGame(GameDevelopers name) {
        gameCompany=null;
        switch (name){
            case PROGRAMMER ->{gameCompany=new GameProgrammer();}
            case SCREENWRITER ->{gameCompany=new GameScreenwriter();}
            case SOUND_ENGINEER ->{gameCompany=new GameSoundEngineer();}
            case ARTIST ->{gameCompany=new GameArtist();}
            case LEVEL_DESIGNER ->{gameCompany=new GameLevelDesigner();}
            default ->{ System.out.println("Fail");}
        }
        return gameCompany;
    }
}
