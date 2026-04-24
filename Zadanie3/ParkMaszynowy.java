// W metodzie głównej klasy ParkMaszynowy

public class ParkMaszynowy {
    public static void main(String[] args) {

        Lokomotywa Gugu = new Lokomotywa(
                "Gugu", // marka
                "MX500", // nazwa
                3600, // pojemnosc cm3
                rodzajSilnikaE.spalina, // paliwo
                3200, // maks masa do udzwigu w tonach
                40 // liczba wagonow
        );
        Gugu.wyswietl();

        Kosiarka husqvarna = new Kosiarka(
                "Husqvarna",
                "Aspire",
                0, rodzajSilnikaE.elektryk,
                true,
                true,
                3
        );
        husqvarna.setCzyNaped(false);
        husqvarna.wyswietl();

        Pojazd auto1 = new Pojazd("Toyota",
                "Supra",
                1800,
                rodzajSilnikaE.hybryda,
                150.0,
                1420.0);
        Pojazd auto2 = new Pojazd("Alfa",
                "Romeo",
                2800,
                rodzajSilnikaE.spalina,
                550.0,
                649.0);
        auto1.wyswietl();
        auto2.wyswietl();
    }
}