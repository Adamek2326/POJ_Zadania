class ObslugaZablokowanegoPliku implements StrategiaBleduPliku {
    public void obsluzWyjatek(Exception e) {
        System.err.println("Plik jest używany przez inny program.");
    }
}