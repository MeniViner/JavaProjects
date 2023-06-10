package T2020.SummerA;

public class Main7 {
    public static void main(String[] args) {
        Truck7[] trucks = new Truck7[5];
        trucks[0] = new Truck7("a03-78","Arik",7,false);
        trucks[1] = new Truck7("b12-34", "John", 5, true);
        trucks[2] = new Truck7("c56-78", "Lisa", 10, false);
        trucks[3] = new Truck7("d90-12", "Mike", 8, true);
        trucks[4] = new Truck7("e34-56", "Emma", 6, false);

        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i].isFree() && trucks[i].getNumStorage() > 7)
                System.out.println(trucks[i].getDriverName());
        }
        boolean a = false;
        for (int i = 1; i < trucks.length-1; i++) {
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
