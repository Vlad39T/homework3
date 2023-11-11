package Homework16;

public class Main {
    public static void main(String[] args) {
        RatePerDay rpd = new RatePerDay("Сидоренко", "ставка", 20, 22, 1750);
        RatePerHour rph = new RatePerHour("Петренко", "погодинна", 20, 160, 125);
        Assignment ass = new Assignment("Іваненко", "відрядна", 15, 3, 2250);
        System.out.print(gorizont() + "\nП.І.Б        | Вид оплати  | Податок/% |   Сума(грн)  |  До сплати(грн) |");
        System.out.println(gorizont());
        System.out.print(rpd.getName() + "    |   Ставка    |   " + rpd.getTax() + "    |     " + rpd.sum() +
                "    |     " + rpd.payable() + "     |");
        System.out.println(gorizont());
        System.out.print(rph.getName() + "     |  Погодинна  |   " + rph.getTax() + "    |     " + rph.sum() + "    |     " +
                rph.payable() + "     |");
        System.out.println(gorizont());
        System.out.print(ass.getName() + "     |   Відрядна  |     " + ass.getTax() + "  |    " + ass.sum() + "      |     " +
         ass.payable()+"      |");
        System.out.println(gorizont());
        System.out.print("Разом        |                                        |      "+ (rpd.sum()+rph.sum()+ ass.sum())+
                 "      |");
        System.out.println(gorizont());
    }

    public static String gorizont() {
        System.out.println();
        for (int i = 0; i < 73; i++) {
            System.out.print("-");
        }
        String a = "";
        return a;
    }
}
