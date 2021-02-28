public class BillOf10 implements Bill{
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
    public String toString() {
        return "номинал 10";
    }
}
