public class Main {
    public static void main (String[] args) {
        // punkt A
        MyPoint A = new MyPoint(4, 4);
        System.out.println("Punkt A: " + A.toString());
        // punkt A to B mierzy odległość z A do B
        System.out.println("Dystans z A do B: " + A.distance(6, 8));
        // punkt A to B mierzy odległość z A do B do utworzonej
        MyPoint B = new MyPoint(6, 9);
        System.out.println("Dystans z A do utworzonego B: " + A.distance(B));
        // mierzy A od 0:
        System.out.println("Dystans A od 0,0: " + A.distance());

        // tworzenie tablicy na 10 MyPoint
        MyPoint[] pkt = new MyPoint[10];

        for (int i = 0; i < 10; i++) {
            int num = i + 1;

            pkt[i] = new MyPoint(num, num);
        }
        System.out.println("Pierwszy: " + pkt[0].toString());
        System.out.println("Ostatni: " + pkt[9].toString());

        // liczenie odległości ze wsp tab. do wybranej
        double A1 = pkt[1].distance(4, 5);
        System.out.println("Dystans 1 do wpisanych: " + A1);

        MyPoint D = pkt[3];
        double A2 = pkt[0].distance(D);
        System.out.println();
        System.out.println("Dystans 2 do D: " + A2);





        System.out.println("---ZAD 2---");

        // tworzenie koła
        MyCircle C1 = new MyCircle(3, 4, 5);
        System.out.println("Circle 1: " + C1.toString());

        // tworzenie drugiego koła
        MyPoint SR = new MyPoint(6, 8);
        MyCircle C2 = new MyCircle(SR, 2);
        System.out.println("Circle 2: " + C2.toString());

        System.out.println("X środka koła C1 to: " + C1.getCenterX());
        C1.setCenterY(10); // Y SR to 10
        System.out.println("aktualny Y SR C1 to: " + C1.getCenterY());

        System.out.println("Pole powierzchni C1: " + C1.getArea());
        System.out.println("Obwod C1: " + C1.getCircumference());


        System.out.println("Circle 1: " + C1.toString());
        System.out.println("Circle 2: " + C2.toString());

        double diffCircle = C1.distance(C2);
        System.out.println("Dystans miedzy C1 a C2 wynosi: " + diffCircle);



        System.out.println("---ZAD 3---");

        MyTriangle T1 = new MyTriangle(0, 0, 4, 0, 0, 3);
        System.out.println("Triangle 1: " + T1.toString());
        System.out.println("Obwód t1: " + T1.getPerimeter());
        System.out.println("Type of the T1: " + T1.getType());

        MyTriangle T2 = new MyTriangle(2, 2, 2, 2, 2, 2);
        System.out.println("Triangle 2: " + T2.toString());
        System.out.println("Obwód T2: " + T2.getPerimeter());
        System.out.println("Type of the T2: " + T2.getType());

        MyTriangle T3 = new MyTriangle(0, 0, 6, 0, 3, 4);
        System.out.println("Triangle 3: " + T3.toString());
        System.out.println("Obwód T3: " + T3.getPerimeter());
        System.out.println("Type of the T3: " + T3.getType());



        System.out.println("---ZAD 5---");

        Customer Grzegorz = new Customer(1, "Grzegorz Brzęszczyszczykiweicz", 20);
        System.out.println("User: " + Grzegorz.toString());

        Invoice Fak1 = new Invoice(1, Grzegorz, 1230);

        System.out.println("Klient: " + Fak1.getCustomerName());
        System.out.println("Kwota przed rabatem: " + Fak1.getAmount() + " PLN");
        System.out.println("Kwota po rabacie: " + Fak1.getAmount() + " PLN");

        Grzegorz.setDiscount(80);
        System.out.println("Wpisano kod rabatowy, nowa kwota: " + Fak1.getAmountAfterDiscount() + " PLN.");



        System.out.println("---Zad 6---");
        ChemicalElements k = new ChemicalElements("Potas", "k", 19);
        System.out.println("Pierwiastek: " + k.getName() + " (" + k.getSymbolicName() + ")");
        System.out.println("Akali? " + k.isAnAkaliMetal());
        System.out.println("Transistion? " + k.isATransitionMetal());
        System.out.println("Metal? " + k.isMetal());

        ChemicalElements Ga = new ChemicalElements("Gallium", "Ga", 31);
        System.out.println("Pierwiastek: " + Ga.getName() + " (" + Ga.getSymbolicName() + ")");
        System.out.println("Akali? " + Ga.isAnAkaliMetal());
        System.out.println("Transistion? " + Ga.isATransitionMetal());
        System.out.println("Metal? " + Ga.isMetal());

        // chyba wkradł się wyżej błąd w zadaniu! Wygląda na to, że Ga nie jest metalem


    }
}
