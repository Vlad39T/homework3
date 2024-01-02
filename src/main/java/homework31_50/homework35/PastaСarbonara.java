package homework31_50.homework35;

public class PastaСarbonara extends Pasta {
    @Override
    public void typePasta() {
        System.out.println("Паста карбонара ");
    }

    @Override
    public void sauce() {
        System.out.println("яичный соус");
    }

    @Override
    public void filling() {
        System.out.println("бекон и пармезан");
    }

    @Override
    public void supplements() {
        System.out.println("соль — по вкусу и молотый чёрный перец — по вкусу");
    }
}
