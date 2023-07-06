package e.q4Bottle;

public class Jerrycan {

    private Bottle[] bottles;

    public Jerrycan(Bottle[] bottles) {
        this.bottles = bottles;
    }
    public Bottle[] getBottles() {
        return bottles;
    }
    public void setBottles(Bottle[] bottles) {
        this.bottles = bottles;
    }

    public boolean isPossible(String liquidType) {
        double sum = 0;

        for (int i = 0; i < bottles.length; i++)
            if (bottles[i] != null && bottles[i].getContent().equals(liquidType))
                sum += bottles[i].LiquidStatus();

        return sum == 50;
    }

}
