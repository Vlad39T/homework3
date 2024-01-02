package homework31_50.homework35;

public class PastaWithMushrooms extends Pasta{
    @Override
    public void typePasta() {
        System.out.println("Паста с грибами и шпинатом");
    }

    @Override
    public void sauce() {
        System.out.println("Шпинат");
    }

    @Override
    public void filling() {
        System.out.println("Грибы");
    }

    @Override
    public void supplements() {
        System.out.println("немного тёртого пармезана;\n" +
                "несколько веточек петрушки");
    }
}
