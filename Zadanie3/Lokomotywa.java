// Zaimplementuj klasę Lokomotywa dziedziczącą po maszynie.
// Klasa ta ma dodawać dwa prywatne atrybuty charakterystyczne dla lokomotyw
// i nieuwzględnione wcześniej w maszynie.
// Klasa ta ma mieć konstruktor, przyjmujący komplet 6 parametrów
// oraz metodę wyswietl, wyrzucającą w zamyśle na ekran wyczerpujący opis danej lokomotywy.

public class Lokomotywa extends Maszyna {
    // Klasa ta ma dodawać dwa prywatne atrybuty charakterystyczne dla lokomotyw
    // i nieuwzględnione wcześniej w maszynie.
    private int maxMasa;
    private int liczbaWagonow;

    // Klasa ta ma mieć konstruktor, przyjmujący komplet 6 parametrów
    public Lokomotywa(String marka,
                      String nazwa,
                      int pojemnoscSilnika,
                      rodzajSilnikaE rodzajSilnika,
                      int maxMasa,
                      int liczbaWagonow) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.maxMasa = maxMasa;
        this.liczbaWagonow = liczbaWagonow;
    }

    // oraz metodę wyswietl, wyrzucającą w zamyśle na ekran wyczerpujący opis danej lokomotywy.
    public void wyswietl() {
        System.out.println("Lokomotywa: ");
        System.out.println("Marka i nazwa: " + marka + " " + nazwa);
        System.out.println("Silnik: " + pojemnoscSilnika + " cm3, typ " + rodzajSilnika);
        System.out.println("Maks masa: " + maxMasa + " ton, Liczba wagonów: " + liczbaWagonow);
        System.out.println(" ");
    }
}