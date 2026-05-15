public class DogsAlarm implements Alarm {

    public void alarmTurnOn(PinEvent event) {
        System.out.println("Wypuszczono psy!");
    }

    public void alarmTurnOff(PinEvent event) {
        System.out.println("Psy odwołane do schronu.");
    }
}