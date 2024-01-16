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
        System.out.println("На часах было " + getHours() + " часов " + getMinutes() + " минут");
        setHours(0);
        setMinutes(20);
        minutes += getMinutes();
        hours += getHours();
        System.out.println("На часах стало " + getHours() + " часов " + getMinutes() + " минут");
    }
}

