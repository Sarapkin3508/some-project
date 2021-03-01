public class BillOf20 implements Bill{
    public static int countOfBills20 = 0;

    public static void setAnInt(int anInt) {
        countOfBills20 = anInt;
    }

    public void decreaseAnInt(){
        countOfBills20 = countOfBills20 - 1;
    }

    public void increaseAnInt(){
        countOfBills20 = countOfBills20 + 1;
    }



    @Override
    public int addBill(int sum) {
        sum = sum + 20;
        return sum;
    }

    @Override
    public int reduceBill(int ded) {
        ded = ded - 20;
        return ded;
    }

    @Override
    public int numberOfBills() {
        return countOfBills20 - 1;
    }

    @Override
    public String toString() {
        return "номинал 20";
    }
}
