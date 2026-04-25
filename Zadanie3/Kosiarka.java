//dziedziczy z maszyny;
// wprowadza prywatne atrybuty czyMelekser (typu boolean),
// czyNaped(j.w.) i liczbaOstrzy (typu int);
// posiada, analogicznie jak klasa Kosiarka, jeden konstruktor i metodę wyswietl,
// która wyświetla komplet 7 atrybutów w zorganizowanej formie;
// dodatkowo, klasa ma zawierać metody set dla wszystkich trzech nowowprowadzanych atrybutów.


//dziedziczy z maszyny;
public class Kosiarka extends Maszyna {

    // wprowadza prywatne atrybuty czyMelekser (typu boolean),
    // czyNaped(j.w.) i liczbaOstrzy (typu int);
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

// posiada, analogicznie jak klasa Kosiarka, jeden konstruktor i metodę wyswietl,
// która wyświetla komplet 7 atrybutów w zorganizowanej formie;

    public Kosiarka(String marka,
                    String nazwa,
                    int pojemnoscSilnika,
                    rodzajSilnikaE rodzajSilnika,
                    boolean czyMelekser,
                    boolean czyNaped,
                    int liczbaOstrzy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }
    public void wyswietl() {
        System.out.println("Kosiarka: ");
        System.out.println("Marka i nazwa: " + marka + " " + nazwa);
        System.out.println("Silnik: " + pojemnoscSilnika + " cm3, typ "+ rodzajSilnika);
        System.out.println("Ostrza: " + liczbaOstrzy + ", Napęd: " + czyNaped + ", Melekser: " + czyMelekser);
        System.out.println("");
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}