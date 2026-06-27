import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CacheSlownikowy {
    private static CacheSlownikowy instancja = null;

    private List<ElementSlownika> zapisaneElementy = new ArrayList<>();
    private final String sciezkaPliku = "dane.csv";

    // Prywatny konstruktor - blokuje użycie 'new CacheSlownikowy()'
    private CacheSlownikowy() {}

    // Globalny dostęp do jedynej instancji
    public static CacheSlownikowy pobierzInstancje() {
        if (instancja == null) {
            instancja = new CacheSlownikowy();
        }
        return instancja;
    }

    // Wczytywanie pliku za pomocą scanera
    public void odswiezDane() {
        System.out.println("\nPobieram dane...");
        List<ElementSlownika> listaTymczasowa = new ArrayList<>();

        try (Scanner skaner = new Scanner(new File(sciezkaPliku))) {

            // Pomijamy pierwszą linijkę (nagłówek tabeli w CSV)
            if (skaner.hasNextLine()) {
                skaner.nextLine();
            }

            // Czytamy plik linijka po linijce
            while (skaner.hasNextLine()) {
                String linia = skaner.nextLine();
                String[] kolumny = linia.split(","); // Dzielimy tekst w miejscach przecinka

                if (kolumny.length < 5) {
                    throw new IllegalArgumentException("Brakuje kolumn w pliku");
                }

                // string na int i usuniecie spacji
                int id = Integer.parseInt(kolumny[0].trim());
                int kluczLiczbowy = Integer.parseInt(kolumny[1].trim());
                String kluczZnakowy = kolumny[2].trim();
                String wartosc = kolumny[3].trim();
                String nazwaSlownika = kolumny[4].trim();

                // Dodajemy nowy element do listy tymczasowej
                listaTymczasowa.add(new ElementSlownika(id, kluczLiczbowy, kluczZnakowy, wartosc, nazwaSlownika));
            }

            // Podmieniamy starą listę na nową
            this.zapisaneElementy = listaTymczasowa;
            System.out.println("Dane w pamięci");

        } catch (IOException e) {
            if (e.getMessage() != null && e.getMessage().contains("odmowa dostępu")) {
                wykonajStrategie(new ObslugaZablokowanegoPliku(), e);
            } else {
                wykonajStrategie(new ObslugaBrakuPliku(), e);
            }
        } catch (Exception e) {
            // łapie niepoprawne dane
            wykonajStrategie(new ObslugaBlednychDanych(), e);
        }
    }

    // zależność
    private void wykonajStrategie(StrategiaBleduPliku strategia, Exception e) {
        strategia.obsluzWyjatek(e);
    }

    // print
    public void wypiszZawartosc() {
        if (zapisaneElementy.isEmpty()) {
            System.out.println("Pamięć jest pusta.");
        } else {
            for (ElementSlownika element : zapisaneElementy) {
                System.out.println(element);
            }
        }
    }
}