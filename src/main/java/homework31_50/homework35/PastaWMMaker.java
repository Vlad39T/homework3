package homework31_50.homework35;

public class PastaWMMaker implements PastaMaker{
    @Override
    public Pasta createPasta() {
        return new PastaWithMushrooms();
    }
}
