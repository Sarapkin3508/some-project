public class BillOf5 implements Bill{

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

    public BillOf5 createBillOf5(){
        BillOf5 billOf5 = new BillOf5();
        return billOf5;
    }

    @Override
    public String toString() {
        return "номинал 5";
    }
}
