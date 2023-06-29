package T2022.SummerB.s7;

public class SportUnion {
    private String unionName;
    private SportClub[] unionData;
    private int numberUnion;

    public String getUnionName() {
        return unionName;
    }

    public void setUnionName(String unionName) {
        this.unionName = unionName;
    }

    public SportClub[] getUnionData() {
        return unionData;
    }

    public void setUnionData(SportClub[] unionData) {
        this.unionData = unionData;
    }

    public int getNumberUnion() {
        return numberUnion;
    }

    public void setNumberUnion(int numberUnion) {
        this.numberUnion = numberUnion;
    }

    public SportUnion(String unionName, SportClub[] unionData, int numberUnion) {
        this.unionName = unionName;
        this.unionData = unionData;
        this.numberUnion = numberUnion;
    }

}
