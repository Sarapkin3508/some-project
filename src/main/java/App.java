import java.util.*;

public class App {
    public static void main(String[] args) {
        BillOf5.countOfBills5 = 25;
        BillOf10.countOfBills10 = 15;
        BillOf20.countOfBills20 = 12;
        BillOf50.countOfBills50 = 8;
        BillOf100.countOfBills100 = 5;
        int balance = BillOf5.countOfBills5  * 5 +  BillOf10.countOfBills10 * 10 + BillOf20.countOfBills20 * 20
                + BillOf50.countOfBills50 * 50 +  BillOf100.countOfBills100 * 100;

        FactoryOfBills factoryOfBills = new FactoryOfBills();

        List<Bill> listOfBills = new ArrayList<>();


        listOfBills.add(factoryOfBills.createBillOf5());
        listOfBills.add(factoryOfBills.createBillOf10());
        listOfBills.add(factoryOfBills.createBillOf20());
        listOfBills.add(factoryOfBills.createBillOf50());
        listOfBills.add(factoryOfBills.createBillOf100());



        Atm atm = new Atm(balance, listOfBills);

        /** countOfMoney is Input of this app**/
        atm.giveMoney(1125, listOfBills);



        }


    }








