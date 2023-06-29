package T2022.SummerB.q4;

public class Actor {
    private String nameS;
    private int age;
    private int numActs;

    public Actor(String nameS, int age, int numActs) {
        this.nameS = nameS;
        this.age = age;
        this.numActs = numActs;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumActs() {
        return numActs;
    }

    public void setNumActs(int numActs) {
        this.numActs = numActs;
    }
}
