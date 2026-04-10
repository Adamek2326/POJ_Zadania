//Zaimplementuj klasę `MyDate`, która przechowuje informację: `month` (typu int),
// `day`(typu int) i `year` (type int).
//Klasa powinna zawierać konstruktor, który inicjalizuje zmienne,
// sprawdzając poprawność zakresów (day 0-31, month 0-12, year 1990-2050).
//Zaimplementuj methody set i get dla wszystkich pól.
//Dodaj metodę `displayDate`, która wyświetli pola z uwzględnieniem zer
// nieznaczących oddzielone znakiem "/", np `21/03/2051`.
//Przetestuj zaimplementowaną klasę.

// Adam


public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate (
            int month,
            int day,
            int year) {
        this.month = month;
        this.day = day;
        this.year = year;

        if (month >= 0 && month <= 12) {
            this.month = month; }
        else { this.month = 1;
        }

        if (day >= 0 && day <= 31) {
            this.day = day;}
        else {this.day = 1;}

        if (year >= 1990 && year <= 2050) {
            this.year = year;}
        else {this.year = 2000;}
        }
    public int getMonth() {return month;}
    public int getDay() {return day;}
    public int getYear() {return year;}

    public void setMonth(int month) {
        this.month = month;
        if (month >= 0 && month <= 12) {
            this.month = month;
        } else {this.month = 1;}
    }

    public void setDay(int day) {
        this.day = day;
        if (day >= 0 && day <= 31) {
            this.day = day;
        } else {this.day = 1;}
    }

    public void setYear(int year) {
        this.year = year;
        if (year >= 1990 && year <= 2050) {
            this.year = year;
        } else {this.year = 2000;}
    }
    public void displayDate() {
        //Stawia liczbę całkowitą (%d), dodaje zer przed tyle, żeby była liczba 2-cyfrowa (02)
        System.out.printf("%02d/%02d/%d\n", this.day, this.month, this.year);
    }
    // M.D.R
    public static void main(String[] args) {
        MyDate date1 = new MyDate(12, 23, 4567);
        System.out.println("Dane po korekcie do domyślnych: ");
        date1.displayDate();

        // Menu ustawień
        date1.setMonth(5);
        date1.setDay(3);
        date1.setYear(2024);

        System.out.println("Data po ustawieniu: ");
        date1.displayDate();
    }


    }