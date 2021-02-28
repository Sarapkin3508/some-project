public class BillOf50 implements Bill{
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
    public String toString() {
        return "номинал 50";
    }
}
