import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int numberOf5 = 20;
        int numberOf10 = 15;
        int numberOf20 = 12;
        int numberOf50 = 8;
        int numberOf100 = 5;
        int balance = numberOf5*5 + numberOf10*10 + numberOf20*20
                + numberOf50*50 + numberOf100*100 ;

        FactoryOfBills factoryOfBills = new FactoryOfBills();

        List<HashMap<Bill, Integer>> listOfBills = new ArrayList<>();

        HashMap<Bill, Integer> hashMapOf5 = new HashMap<>();
        hashMapOf5.put(factoryOfBills.createBillOf5(), numberOf5);


        HashMap<Bill, Integer> hashMapOf10 = new HashMap<>();
        hashMapOf10.put(factoryOfBills.createBillOf10(), numberOf10);

        HashMap<Bill, Integer> hashMapOf20 = new HashMap<>();
        hashMapOf20.put(factoryOfBills.createBillOf20(), numberOf20);

        HashMap<Bill, Integer> hashMapOf50 = new HashMap<>();
        hashMapOf50.put(factoryOfBills.createBillOf50(), numberOf50);

        HashMap<Bill, Integer> hashMapOf100 = new HashMap<>();
        hashMapOf100.put(factoryOfBills.createBillOf100(), numberOf100);

        listOfBills.add(hashMapOf5);
        listOfBills.add(hashMapOf10);
        listOfBills.add(hashMapOf20);
        listOfBills.add(hashMapOf50);
        listOfBills.add(hashMapOf100);


        Atm atm = new Atm(balance,listOfBills);

        atm.giveMoney(455,listOfBills);


    }
}
