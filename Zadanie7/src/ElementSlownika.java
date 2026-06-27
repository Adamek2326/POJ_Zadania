class ElementSlownika {
    private int id;
    private int kluczLiczbowy;
    private String kluczZnakowy;
    private String nazwaSlownika;
    private String wartosc;


    public ElementSlownika(int id, int kluczLiczbowy, String kluczZnakowy, String wartosc, String nazwaSlownika) {
        this.id = id;
        this.kluczLiczbowy = kluczLiczbowy;
        this.kluczZnakowy = kluczZnakowy;
        this.wartosc = wartosc;
        this.nazwaSlownika = nazwaSlownika;
    }
    public String toString() {
        return String.format("[%s] ID: %d, Klucze: (%d, %s) | %s",
                nazwaSlownika, id, kluczLiczbowy, kluczZnakowy, wartosc);
    }
}