package homework31_50.homework35;

public class Run {
    public static void main(String[] args) {
        PastaMaker maker = new PastaСarbonaraMaker();
        PastaMaker maker2 = new PastaBologneseMaker();
        PastaMaker maker3 = new PastaWMMaker();
        Pasta pasta = maker.createPasta();
        Pasta pasta2 = maker2.createPasta();
        Pasta pasta3 = maker3.createPasta();

        pasta.typePasta();
        pasta2.typePasta();
        pasta3.typePasta();
    }
}
