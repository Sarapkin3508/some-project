public class BillOf20 implements Bill{
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
    public String toString() {
        return "номинал 20";
    }
}
