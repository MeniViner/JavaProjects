package T2020.SummerB;

public class City {
    private String name;
    private int people;
    private int branch;

    public City(String name, int people, int branch) {
        this.name = name;
        this.people = people;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public boolean isFit() {

        return true;
    }


}
