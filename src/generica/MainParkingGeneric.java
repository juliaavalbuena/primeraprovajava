package generica;

public class MainParkingGeneric {
    public static void main(String[] args) {
        ParkingGeneric <Cotxe> parkingCotxes = new ParkingGeneric<>(5);
        parkingCotxes.entrada (new Cotxe("837393BB"));
        ParkingGeneric <Bicicleta> parkingBicis = new ParkingGeneric<>(10);
        parkingBicis.entrada (new Bicicleta("837393BB","Mercedes"));

    }
}
