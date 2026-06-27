class ObslugaBrakuPliku implements StrategiaBleduPliku {
    public void obsluzWyjatek(Exception e) {
        System.err.println("Brak pliku! Upewnij się, że 'dane.csv' istnieje.");
    }
}