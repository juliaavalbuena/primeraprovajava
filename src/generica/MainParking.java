package generica;

public class MainParking {
    public static void main(String[] args) {
        Cotxe c1 = new Cotxe("6767LOL", 67);
        Cotxe c2 = new Cotxe("8173JHZ");
        Cotxe c3 = new Cotxe("2009SEP", 3);

        Parking p = new Parking(5);
        p.print();

        p.entrada(c1);
        p.entrada(c2);

        p.print();

        p.entrada (c3);
        p.sortida (c2);

        p.print();
    }
}
