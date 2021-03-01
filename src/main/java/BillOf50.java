public class BillOf50 implements Bill{
    public static int countOfBills50 = 0;

    public static void setAnInt(int anInt) {
        countOfBills50 = anInt;
    }

    public void decreaseAnInt(){
        countOfBills50 = countOfBills50 - 1;
    }

    public void increaseAnInt(){
        countOfBills50 = countOfBills50 + 1;
    }

    @Override
    public int addBill(int sum) {
        sum = sum + 50;
        return sum;
    }

    @Override
    public int reduceBill(int ded) {
        ded = ded - 50;
        return ded;
    }

    @Override
    public int numberOfBills() {
        return countOfBills50;
    }

    @Override
    public String toString() {
        return "номинал 50";
    }
}
