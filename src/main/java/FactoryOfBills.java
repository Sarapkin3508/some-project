public class FactoryOfBills {

    public FactoryOfBills() {
    }

    public BillOf5 createBillOf5(){
        return new BillOf5();
    }

    public BillOf10 createBillOf10(){
        return new BillOf10();
    }

    public BillOf20 createBillOf20() { return new BillOf20(); }

    public BillOf50 createBillOf50(){
        return new BillOf50();
    }

    public BillOf100 createBillOf100(){
        return new BillOf100();
    }

    public void changeCountOfBills(Bill bill){
        if (BillOf5.class.equals(bill.getClass())) {
            BillOf5.countOfBills5 = BillOf5.countOfBills5 - 1;
        } else if (BillOf10.class.equals(bill.getClass())) {
            BillOf10.countOfBills10 = BillOf10.countOfBills10 - 1;
        } else if (BillOf20.class.equals(bill.getClass())) {
            BillOf20.countOfBills20 = BillOf20.countOfBills20 - 1;
        } else if (BillOf50.class.equals(bill.getClass())) {
            BillOf50.countOfBills50 = BillOf50.countOfBills50 - 1;
        } else if (BillOf100.class.equals(bill.getClass())) {
            BillOf100.countOfBills100 = BillOf100.countOfBills100 - 1;
        }

    }





}
