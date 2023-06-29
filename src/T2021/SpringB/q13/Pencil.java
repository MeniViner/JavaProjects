package T2021.SpringB.q13;

public class Pencil {
    private String color1;
    private String color2;
    private int size;

    public Pencil(String color1, String color2, int size) {
        this.color1 = color1;
        this.color2 = color2;
        this.size = size;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSameColors(Pencil other) {
        if (other.getColor1().equals(color1) || other.getColor1().equals(color2))
            if (other.getColor2().equals(color1) || other.getColor2().equals(color2))
                return true;
        return false;
    }

}
