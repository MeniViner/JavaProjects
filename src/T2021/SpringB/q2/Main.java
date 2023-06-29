package T2021.SpringB.q2;

public class Main {
    public static void main(String[] args) {
        Necklace[] necklaces = new Necklace[4];
        necklaces[0] = new Necklace(6, 0, 0);
        necklaces[1] = new Necklace(2, 2, 2);
        necklaces[2] = new Necklace(3, 3, 0);
        necklaces[3] = new Necklace(3, 1, 2);

        for (int i = 0; i < necklaces.length; i++) {
            int type = necklaces[i].getNecklaceType();

            switch (type) {
                case 1:
                    System.out.println("Even necklace (" + type + ")");
                    break;
                case 2:
                    System.out.println("Perfect necklace (" + type + ")");
                    break;
                case 3:
                    System.out.println("Boring necklace (" + type + ")");
                    break;
                case 4:
                    System.out.println("Normal necklace  (" + type + ")");
                    break;
            }
        }

        int num = 1;

        System.out.println("Boring necklaces above " + num + ": " +
                Necklace.countBoringNecklaces(necklaces, num));
    }
}
