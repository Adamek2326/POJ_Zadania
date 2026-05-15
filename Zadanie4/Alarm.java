// interfejs dla pozostałych alarmów
public interface Alarm {
    void alarmTurnOn(PinEvent event);
    void alarmTurnOff(PinEvent event);
}
