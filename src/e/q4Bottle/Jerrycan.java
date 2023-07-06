package e.q4Bottle;

public class Jerrycan {

    private Bottle[] bottles;

    public Jerrycan(Bottle[] bottles) {
        this.bottles = bottles;
    }
    public Bottle[] getBottles() {
        return bottles;
    }
    public void setBottles(Bottle[] bottles) {
        this.bottles = bottles;
    }

    public boolean isPossible(String liquidType) {
        double sum = 0;

        for (int i = 0; i < bottles.length; i++)
            if (bottles[i] != null && bottles[i].getContent().equals(liquidType))
                sum += bottles[i].LiquidStatus();

        return sum == 50;
    }

}
/*
א.

| a | b |  i  |  j  | i[arr] | j[arr] | if1 | if2 |
|---|---|-----|-----|--------|--------|-----|-----|
| 2 | 9 |  -  |  -  |   -    |   -    |  -  |  -  |
| - | - |  0  |  7  |   2    |   9    |  f  |  f  |
| - | 5 |  1  |  6  |   3    |   5    |  f  |  t  |
| 4 | - |  2  |  5  |   4    |   4    |  t  |  f  |
| - | - |  3  |  4  |   5    |   9    |  f  |  f  |
| - | - |  4  |  3  |   9    |   5    |  f  |  f  |
| - | - |  5  |  2  |   4    |   4    |  f  |  f  |
| - | 3 |  6  |  1  |   5    |   3    |  t  |  f  |
| - | - |  7  |  0  |   9    |   2    |  f  |  f  |

output: 1

ב.
הפונקציה, תחזיר את הערך האבסולוטי.של המספר האי זוגי הכי קטן במערך.מינוס המספר הזוגי הכי גדול במערך.
The function will return the absolute value of the smallest odd number in the array minus the largest even number in the array.

ג.
for example {9,2,7,4} -> 2-7 = -5


*/
