package T2022.SummerB.q5;

public class Status {
    private int count1;
    private int count2;
    private String names;

    public int getCount1() {
        return count1;
    }

    public void setCount1(int count1) {
        this.count1 = count1;
    }

    public int getCount2() {
        return count2;
    }

    public void setCount2(int count2) {
        this.count2 = count2;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Status(int count1, int count2, String names) {
        this.count1 = count1;
        this.count2 = count2;
        this.names = names;
    }
}
