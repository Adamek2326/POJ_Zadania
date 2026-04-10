// Zaimplementuj klasę `Card` reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać `wartość` i `kolor`: kier, karo, pik, trefl.
// W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący, który stworzy trzy różne obiekty klasy `Card`.

// String przyjmuje cokolwiek! Zauważy zmianę dopiero gdy jest za późno.
// enum (typ wyliczeniowy) tworzy whitelistę i wskazuje referencją na nie!

// Adam

enum typ {
    kier, karo, pik, trefl
}

public class Card {
    private String wartosc;
    private typ kolor;

    public Card(String poczWart, typ poczKolor) {
        wartosc = poczWart;
        kolor = poczKolor;
    }
    public String getWart() {
        return wartosc;
    }
    public typ getKolor() {
        return kolor;
    }


public static void main(String[] args) {
    Card karta1 = new Card("Joker", typ.pik);
    Card karta2 = new Card("10",typ.karo);
    Card karta3 = new Card("Dama", typ.kier);

    System.out.println("Wybrana karta nr. 1 to " + karta1.getWart() + " "+ karta1.getKolor());
    System.out.println("Wybrana karta nr. 2 to " + karta2.getWart() + " "+ karta2.getKolor());
    System.out.println("Wybrana karta nr. 3 to " + karta3.getWart() + " "+ karta3.getKolor());
    }
}