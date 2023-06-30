package T2022.SummerB.q11;

import java.util.Scanner;

public class MonthFuel {

    private final Invoice[] invoices;
    private int current;

    public MonthFuel(int current, Invoice[] invoices) {
        this.invoices = new Invoice[1000];
        this.current = 0;
    }


    public void addInvoice(int day, String num, String name, double fuel) {
        invoices[current++] = new Invoice(day, num, name, fuel);
    }

    public double[] fuelPerDay() {
        double[] arr = new double[32];
        double sum = 0;
        for (int i = 0; i < invoices.length; i++) {
            sum += invoices[i].getFuel();
            for (int j = 0; j < 32; j++) {
                if (invoices[i].getDay() == current)
                    arr[current++] = invoices[i].getFuel();
            }
        }
        arr[0] = sum;
        return arr;
    }

    public String maxFuelPerCar() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < invoices.length; i++) {
            double sum = 0;
            for (int j = 0; j <= 31; j++)
                sum += invoices[j].getFuel();
            if (sum > max) {
                max = invoices[i].getFuel();
                index = i;
            }
        }
        return invoices[index].getNum();
    }
}
