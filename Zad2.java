public class Zad2 {
    public static void main(String[] args) {
        double Pi = 3.14159265359;
        double wynik = Math.sqrt(Pi);
        double zaokraglone = Math.round(wynik * 100.0) / 100.0;
        System.out.println(zaokraglone);
    }
}