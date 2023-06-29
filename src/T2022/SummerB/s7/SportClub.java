package T2022.SummerB.s7;

public class SportClub {
    private int name;
    private String sportName;
    private String city;
    private int countOfPlayer;
    private int countOfCoach;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountOfPlayer() {
        return countOfPlayer;
    }

    public void setCountOfPlayer(int countOfPlayer) {
        this.countOfPlayer = countOfPlayer;
    }

    public int getCountOfCoach() {
        return countOfCoach;
    }

    public void setCountOfCoach(int countOfCoach) {
        this.countOfCoach = countOfCoach;
    }

    public SportClub(int name, String sportName, String city, int countOfPlayer, int countOfCoach) {
        this.name = name;
        this.sportName = sportName;
        this.city = city;
        this.countOfPlayer = countOfPlayer;
        this.countOfCoach = countOfCoach;
    }
}
