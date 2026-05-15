import java.util.ArrayList;
import java.util.List;

public class Safe {
    // Pola prywatne (hermetyzacja)
    private String pin;
    public List<Alarm> alarms;

    public Safe(String pin) {
        this.pin = pin;
        this.alarms = new ArrayList<>(); // Inicjalizujemy pustą listę
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String enteredPin) {
        if (this.pin.equals(enteredPin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    private void wrongPin() {
        System.out.println("BŁĘDNY PIN! ZAGŁADA LEŻY BLISKO!");
        PinEvent event = new PinEvent(this);
        for (int i = 0; i < alarms.size(); i++) {
            alarms.get(i).alarmTurnOn(event);
        }
    }

    private void correctPin() {
        System.out.println("Sejf otwarty.");
        PinEvent event = new PinEvent(this);
        for (Alarm alarm : alarms) {
            alarm.alarmTurnOff(event);
        }
    }
}