package T2021.SpringA.q2;

public class Main {
    public static String smallBox(Box[] arr) {
        int flag = 0, c = 0;
        int f = arr[0].getHeight() * arr[0].getLength() * arr[0].getWidth();

        for (int i = 1; i < arr.length; i++) {
            c = arr[i].getWidth() * arr[i].getHeight() * arr[i].getLength();
            if (c < f) {
                f = c;
                flag = i;
            }
        }
        return arr[flag].getColor();
    }

    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        boxes[0] = new Box("Braun", 20, 35, 89);
        boxes[1] = new Box("Blue", 15, 25, 40);
        boxes[2] = new Box("Red", 10, 30, 50);
        boxes[3] = new Box("Green", 25, 45, 70);
        boxes[4] = new Box("Yellow", 1, 2, 60);
        String str = smallBox(boxes);
        System.out.println(str);
    }
}
