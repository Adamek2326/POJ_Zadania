// Zaimplementuj abstrakcyjną klasę Maszyna z chronionymi atrybutami:
// marka, nazwa, pojemnoscSilnika i rodzajSilnika.
// Ten ostatni ma być enumeracją.

enum rodzajSilnikaE {
    spalina, elektryk, hybryda
}

// marka, nazwa, pojemnoscSilnika i rodzajSilnika.
public abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected int pojemnoscSilnika;
    protected rodzajSilnikaE rodzajSilnika;

    public Maszyna(String marka,
                   String nazwa,
                   int pojemnoscSilnika,
                   rodzajSilnikaE rodzajSilnika) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }



}

