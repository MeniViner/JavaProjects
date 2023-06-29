package T2020.SummerA.q7;

public class Main {
    public static void main(String[] args) {
        Truck[] trucks = new Truck[5];
        trucks[0] = new Truck("a03-78", "Arik", 7, false);
        trucks[1] = new Truck("b12-34", "John", 5, true);
        trucks[2] = new Truck("c56-78", "Lisa", 10, false);
        trucks[3] = new Truck("d90-12", "Mike", 8, true);
        trucks[4] = new Truck("e34-56", "Emma", 6, false);

        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i].isFree() && trucks[i].getNumStorage() > 7)
                System.out.println(trucks[i].getDriverName());
        }
        boolean a = false;
        for (int i = 1; i < trucks.length - 1; i++) {
            if (trucks[i].isFree())
                a = true;
        }
        if (a){
            int max = trucks[0].getNumStorage();
            for (int i = 1; i < trucks.length-1; i++) {
                if (trucks[i].isFree() && trucks[i].getNumStorage() > max)
                    max = i;
            }
            System.out.println(trucks[max].getTruckId());
        }
    }
}
