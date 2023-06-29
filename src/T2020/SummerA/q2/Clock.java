package T2020.SummerA.q2;

public class Clock {
    private int hour; //23
    private int min; //59

    public Clock(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getInterval(){
        int time = 0;
        time += 23 - (hour * 60);
        time += 59 - (min);
        return time;
    }

}
