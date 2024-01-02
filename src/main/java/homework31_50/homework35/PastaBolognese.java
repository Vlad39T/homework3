package homework31_50.homework35;

public class PastaBolognese extends Pasta{
    @Override
    public void typePasta() {
        System.out.println("Паста болоньезе");
    }

    @Override
    public void sauce() {
        System.out.println("Томатная паста");
    }

    @Override
    public void filling() {
        System.out.println("Фарш");
    }

    @Override
    public void supplements() {
        System.out.println("немного тёртого пармезана");
    }
}
