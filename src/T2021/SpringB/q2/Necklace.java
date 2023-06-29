package T2021.SpringB.q2;

public class Necklace {
    private int red;
    private int green;
    private int blue;

    public Necklace(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getNecklaceType() {
        if (green > 0 && red == 0 && blue == 0 || green == 0 && red > 0 && blue == 0 || green == 0 && red == 0 && blue > 0)
            return 1;
        else if (green == red && green == blue)
            return 2;
        else if (green > 0 && red > 0 && blue == 0 || green == 0 && red > 0 && blue > 0 || green > 0 && red == 0 && blue > 0)
            return 3;
        else
            return 4;
    }

    public static int countBoringNecklaces(Necklace[] necklaces, int num) {
        int x = 0;
        for (int i = 0; i < necklaces.length; i++) {
            int size = necklaces[i].getBlue();
            size += necklaces[i].getGreen();
            size += necklaces[i].getRed();

            if (size > num)
                if (necklaces[i].getNecklaceType() == 3)
                    x++;
        }
        return x;
    }
}
