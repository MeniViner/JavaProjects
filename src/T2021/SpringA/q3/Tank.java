package T2021.SpringA.q3;

public class Tank {
    private int capacity;
    private int amount;

    public Tank(int capacity, int amount) {
        this.capacity = capacity;
        this.amount = amount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int Tank(int capacity) {
        return amount = 0;
    }

    public boolean isFull() {
        return getCapacity() > 0;
    }

    public boolean isPossible(int num, char op) {
        boolean flag = false;
        if (op == '+') {
            if (this.amount + num <= this.capacity) {
                this.amount += num;
                flag = true;
            }
        } else {
            if (this.amount >= num) {
                this.amount -= num;
                flag = true;
            }
        }
        return flag;
    }

}
