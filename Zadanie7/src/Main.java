public class Main {
    //sleep
    public static void main(String[] args) throws InterruptedException {

        CacheSlownikowy cache = CacheSlownikowy.pobierzInstancje();

        while (true) {
            cache.odswiezDane();
            cache.wypiszZawartosc();
            System.out.println("---");
            System.out.println("Wrótce nastąpi odświeżenie...");
            System.out.println("---");
            Thread.sleep(300000);
        }
    }
}