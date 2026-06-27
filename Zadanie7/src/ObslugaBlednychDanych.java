class ObslugaBlednychDanych implements StrategiaBleduPliku {
    @Override
    public void obsluzWyjatek(Exception e) {
        System.err.println("Plik zawiera uszkodzone dane");
    }
}