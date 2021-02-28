public class BillOf100 implements Bill{
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
    public String toString() {
        return "номинал 100";
    }
}
