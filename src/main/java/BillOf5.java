public class BillOf5 implements Bill{
   public static int countOfBills5 = 0;



    public static void setAnInt(int anInt) {
        countOfBills5 = anInt;
    }

    public void decreaseAnInt(){
        countOfBills5 = countOfBills5 - 1;
    }

    public void increaseAnInt(){
        countOfBills5 = countOfBills5 + 1;
    }

    @Override
    public int addBill(int sum) {
        sum = sum + 5;
        return sum;
    }

    @Override
    public int reduceBill(int ded) {
        ded = ded - 5;
        return ded;
    }

    @Override
    public int numberOfBills() {
        return countOfBills5 - 4;
    }

    public BillOf5 createBillOf5(){
        BillOf5 billOf5 = new BillOf5();
        return billOf5;
    }

    @Override
    public String toString() {
        return "номинал 5";
    }


}
