package T2022.SummerB.q4;

public class Act {
    private String actName;
    private int len;
    private static Actor[] actArr;
    private int currentNum;

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Actor[] getActArr() {
        return actArr;
    }

    public void setActArr(Actor[] actArr) {
        Act.actArr = actArr;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }

    public Act(String actName, int len, Actor[] actArr, int currentNum) {
        this.actName = actName;
        this.len = len;
        Act.actArr = new Actor[5];
        this.currentNum = currentNum;
    }

    public static String addActors(Actor a) {
        for (int i = 0; i < actArr.length; i++)
            if (actArr[i] == null)
                if (a.getAge() >= 45 && a.getNumActs() >= 5) {
                    actArr[i] = a;
                    return "was suitable.";
                }
        return "not suitable.";
    }

    public static int experienced() {
        int x = 0;
        for (Actor actor : actArr)
            if (actor.getNumActs() >= 10)
                x++;
        return x;
    }

}
