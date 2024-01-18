package object;

public class Clock {
    private int minutes;
    private int hours;

    public Clock(int minutes, int hours) {
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void time() {
        String text = String.format("На часах было %d часов %d минут",
                getHours(), getMinutes());
        System.out.println(text);
        setHours(0);
        setMinutes(20);
        minutes += getMinutes();
        hours += getHours();
        String text1 = String.format("На часах стало %d часов %d минут",
                getHours(), getMinutes());
        System.out.println(text1);
    }
}

