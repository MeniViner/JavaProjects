package T2020.SummerA;

import java.util.Scanner;

public class Family12 {
    private String name;
    private int num;
    private double totalSum;

    public Family12 (String name, int num, double totalSum){
        this.num = num;
        this.totalSum = 0;
    }
    public double getTotalSum() {
        return totalSum;
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        int age = 0;
        double sum = 100;
        age = s.nextInt();
        if (age <= 3)
            sum += 20.5;
        else if (age > 3 && age <12)
            sum += 30;
        else
            sum += 40.5;
        this.totalSum = sum;
    }
}
