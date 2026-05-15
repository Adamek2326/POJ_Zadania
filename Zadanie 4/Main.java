public class Main {
    public static void main(String[] args) {
        Safe main = new Safe("2137");
        Alarm psy = new DogsAlarm();
        // psy w liście alarm
        main.addAlarm(psy);

        System.out.println("błędny");
        main.enterPin("9999");

        System.out.println("poprawny");
        main.enterPin("2137");
    }
}