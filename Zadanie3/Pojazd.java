// Ostatnią klasą dziedziczącą bezpośrednio z maszyny jest klasa Pojazd.
// Klasa zawierać będzie pojedynczy konstruktor,
// standardową metodę wyświetlającą oraz chronione atrybuty typu double moc oraz momentObrotowy.
// Konstruktor ma realizować autonumerowanie pojazdów.
// W tym celu należy posłużyć się parą klasowych
// atrybutów typu int: nrPojazdu oraz maxLiczbaPojazdow (ten ostatni statyczny).
// Metoda wyświetlająca ma uwzględniać obie wskazane informacje, np. Pojazd 7 z 12....

// Ostatnią klasą dziedziczącą bezpośrednio z maszyny jest klasa Pojazd.
public class Pojazd extends Maszyna {

    // standardową metodę wyświetlającą oraz chronione atrybuty typu double moc oraz momentObrotowy.
    protected double moc;
    protected double momentObrotowy;

    // atrybutów typu int: nrPojazdu oraz maxLiczbaPojazdow (ten ostatni statyczny).
    private int nrPojazdu = 0;
    private static int maxLiczbaPojazdow = 0;

    // Konstruktor ma realizować autonumerowanie pojazdów.
    public Pojazd(String marka,
                  String nazwa,
                  int pojemnoscSilnika,
                  rodzajSilnikaE rodzajSilnika,
                  double moc,
                  double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        maxLiczbaPojazdow++;
        this.nrPojazdu = maxLiczbaPojazdow;
    }
    public void wyswietl() {
        System.out.println("Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow + "...");
        System.out.println("Marka i nazwa: " + marka + " " + nazwa);
        System.out.println("Silnik: " + pojemnoscSilnika + " cm3, typ: "+ rodzajSilnika);
        System.out.println("Osiagi: Moc " + moc + " kM, Moment obrotowy: " + momentObrotowy + " nm");
        System.out.println(" ");
    }
}