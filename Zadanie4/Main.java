public class Main {
    public static void main(String[] args) {
        Safe main = new Safe("2137");
        Alarm psy = new DogsAlarm();
        main.addAlarm(psy);

        System.out.println("błędny");
        main.enterPin("9999");

        System.out.println("poprawny");
        main.enterPin("2137");
    }
}
