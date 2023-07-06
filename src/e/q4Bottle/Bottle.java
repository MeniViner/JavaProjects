package e.q4Bottle;

public class Bottle {
    private String content;
    private double current;
    private double volume;

    public Bottle(String content, double current, double volume) {
        this.content = content;
        this.current = current;
        this.volume = volume;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String fillingStatus() {
        if (current == 0)
            return "Empty";
        else if (current <= 0.5)
            return "Half-full";
        else
            return "Completely full";
    }

    public double LiquidStatus() {
        return current * volume;
    }
}
