package homework31_50.homework35;

public class PastaBologneseMaker implements PastaMaker{
    @Override
    public Pasta createPasta() {
        return new PastaBolognese();
    }
}
