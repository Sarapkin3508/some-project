public class BillOf100 implements Bill{
    public static int countOfBills100 = 0;

    public static void setAnInt(int anInt) {
        countOfBills100 = anInt;
    }

    public void decreaseAnInt(){
        countOfBills100 = countOfBills100 - 1;
    }

    public void increaseAnInt(){
        countOfBills100 = countOfBills100 + 1;
    }


    @Override
    public int addBill(int sum) {
        sum = sum + 100;
        return sum;
    }

    @Override
    public int reduceBill(int ded) {
        ded = ded - 50;
        return ded;
    }

    @Override
    public int numberOfBills() {
        return countOfBills100;
    }

    @Override
    public String toString() {
        return "номинал 100";
    }
}
