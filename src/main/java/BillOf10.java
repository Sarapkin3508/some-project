public class BillOf10 implements Bill{
    public static int countOfBills10 = 0;

    public static void setAnInt(int anInt) {
        countOfBills10 = anInt;
    }

    public void decreaseAnInt(){
        countOfBills10 = countOfBills10 - 1;
    }

    public void increaseAnInt(){
        countOfBills10 = countOfBills10 + 1;
    }

    @Override
    public int addBill(int sum) {
        sum = sum + 10;
        return sum;
    }

    @Override
    public int reduceBill(int ded) {
        ded = ded - 10;
        return ded;
    }

    @Override
    public int numberOfBills() {
        return countOfBills10 - 1;
    }

    @Override
    public String toString() {
        return "номинал 10";
    }
}
