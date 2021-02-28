public class FactoryOfBills {

    public FactoryOfBills() {
    }

    public BillOf5 createBillOf5(){
        return new BillOf5();
    }

    public BillOf10 createBillOf10(){
        return new BillOf10();
    }

    public BillOf20 createBillOf20(){
        return new BillOf20();
    }

    public BillOf50 createBillOf50(){
        return new BillOf50();
    }

    public BillOf100 createBillOf100(){
        return new BillOf100();
    }





}
