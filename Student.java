// Zaimplementuj klasę `Student`, do przechowywania `imienia`, `nazwiska`,
// `numer indeksu` i `obecność` (wyrażonej w procentach) `oceny z POJ` (typu int).

// Jeżeli podczas tworzenia obiektu nie zostało przekazane imię i nazwisko,
// pola powinny być ustawione wartością "Unknown".

// Dodaj odpowiednie metody set i get do wszystkich pól klasy. (pob. danychStud, zmiana obec i oceny)
// Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2.

// Przetestuj program, tworząc trzy różne obiekty klasy `Student`.

// Adam

public class Student {
    private String imie;
    private String nazwisko;
    private String nrIndeksu;
    private int obecnosc;
    private int ocena;

    public Student(
            // parametry
            String imie,
            String nazwisko,
            String nrIndeksu,
            int obecnosc,
            int ocena) {
                // zapis
                this.imie = imie;
                this.nazwisko = nazwisko;
                this.nrIndeksu = nrIndeksu;
                this.obecnosc = obecnosc;

        if (obecnosc < 50) {
            this.ocena = 2;
        } else {
            this.ocena = ocena;
        }
    }
    public Student(String nrIndeksu, int obecnosc, int ocena) {
        this.imie = "Unknown";
        this.nazwisko = "Unknown";
        this.nrIndeksu = nrIndeksu;
        this.obecnosc = obecnosc;
        this.ocena = ocena;

        if (obecnosc < 50) {
            this.ocena = 2;
        } else {
            this.ocena = ocena;
        }
    }
    public String getImie() {return imie;}
    public String getNazwisko() {return nazwisko;}
    public String getNrIndeksu() {return nrIndeksu;}
    public int getObecnosc() {return obecnosc;}
    public int getOcena() {return ocena;}

    public void setOcena(int nowaOcena) {
        ocena = nowaOcena;
    }
    public void setObecnosc(int nowaObecnosc) {
        obecnosc = nowaObecnosc;
        if (obecnosc < 50) {
            ocena = 2;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("s12345", 40, 5);
        Student s2 = new Student("Janek", "Kaczmarek", "s23456", 100, 5);
        Student s3 = new Student("s99999", 80, 4);
        s3.setOcena(3);
        s2.setObecnosc(30);

        System.out.println("Student 1: " + s1.getImie() + " " + s1.getNazwisko() + ", Indeks: " + s1.getNrIndeksu() + ", Ocena: " + s1.getOcena());
        System.out.println("Student 2: " + s2.getImie() + " " + s2.getNazwisko() + ", Indeks: " + s2.getNrIndeksu() + ", Ocena: " + s2.getOcena());
        System.out.println("Student 3: " + s3.getImie() + " " + s3.getNazwisko() + ", Indeks: " + s3.getNrIndeksu() + ", Ocena: " + s3.getOcena());
    }


}
