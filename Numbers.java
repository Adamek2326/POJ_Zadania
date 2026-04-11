//Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby
// typu integer. Dodaj metody:
//- `sum()`, zwraca sumę liczb;
//- `average()`, zwraca średnią arytmetyczną liczb;
//- `min()`, zwraca najmniejszą z liczb;
//- `max()`, zwraca największą z liczb;
//- `geometric()`, zwraca średnią geometryczną liczb;
//Przetestuj zaimplementowany program.

// Adam


public class Numbers {
    private int a;
    private int b;
    private int c;

    public Numbers(
            int a,
            int b,
            int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // `sum()`, zwraca sumę liczb
    public int sum() {
        return this.a + this.b + this.c;
    }

    // average()`, zwraca średnią arytmetyczną liczb
    public double average() {
        return sum() / 3;
    }

    // min()`, zwraca najmniejszą z liczb
    // szklanka, nie potrafi 3 wartości przyjąć Java
    public int min() {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    // max()`, zwraca największą z liczb;
    public int max() {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // geometric()`, zwraca średnią geometryczną liczb;
    public double geometric() {
        return Math.cbrt(this.a * this.b * this.c);
    }

    public static void main(String[] args) {
        Numbers war = new Numbers(1, 3, 5);

        System.out.println("Suma: " + war.sum());
        System.out.println("Srednia arytmetyczna: " + war.average());
        System.out.println("Najmniejsza (min): " + war.min());
        System.out.println("Najwieksza (max): " + war.max());
        System.out.println("Srednia geometryczna: " + war.geometric());


    }
}


