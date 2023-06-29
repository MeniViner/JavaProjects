package T2021.SpringB.q13;

public class Pack {

    private Pencil[] allPencils;
    private String colors[];
    private int currNum;
    private int max;
    private int min;

    public Pack(int num, String[] colors, int min, int max) {
        this.allPencils = new Pencil[num];
        this.colors = colors;
        this.currNum = 0;
        this.min = min;
        this.max = max;
    }

    public boolean isFit(Pencil p) {
        if (p.getSize() < min || p.getSize() > max)
            return false;
        if (p.getColor1().equals(p.getColor2()))
            return false;
        int flag = 0;
        for (String color : colors) {
            if (p.getColor1().equals(color))
                flag++;
            if (p.getColor2().equals(color))
                flag++;
        }
        return flag == 2;
    }

    public boolean add(Pencil p) {
        if (!isFit(p))
            return false;
        for (int i = 0; i < allPencils.length; i++) {
            if (allPencils[i] == null) {
                allPencils[i] = p;
                return true;
            }
        }
        return false;
    }

    public int countColor(String color) {
        int countPencils = 0;
        for (String s : colors) {
            if (s.equals(color))
                countPencils++;
        }
        return countPencils;
    }

    public String[] missing() {
        int missingColors = 0;
        for (int i = 0; i < colors.length; i++) {
            if (countColor(colors[i]) == 0)
                missingColors++;
        }
        String[] colorsMissing = new String[missingColors];
        return colorsMissing;
    }

}
