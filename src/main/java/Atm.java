import java.util.*;
import java.util.function.Function;

public class Atm {

    private int balance;
    private HashMap<Bill, Integer> numberOfBills;
    private List<HashMap<Bill, Integer>> listOfBills;


    public Atm(int balance,List<HashMap<Bill, Integer>> listOfBills) {

        this.balance = balance;
        this.listOfBills = listOfBills;
    }



    public void giveMoney(int countOfMoney, List<HashMap<Bill, Integer>> listOfBills){
        int countOfGiven = 0;
        HashMap<Bill, Integer> maxBills = new HashMap<>();
        while (countOfMoney != countOfGiven || countOfMoney < countOfGiven) {
            for (HashMap<Bill, Integer> itVar : listOfBills) {
                if (Collections.max(itVar.values()) > Collections.max(maxBills.values())) {
                    maxBills = itVar;
                }
            }
            Bill[] usableBill = (Bill[]) maxBills.keySet().toArray();
            countOfGiven = usableBill[0].reduceBill(countOfGiven);
            maxBills.put(usableBill[0], maxBills.get(usableBill[0])-1);
            System.out.println("Выдана одна купюра " + usableBill[0]);
        }


    }

    public void findMin(HashMap<Bill, Integer> numberOfBills){

    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public HashMap<Bill, Integer> getNumberOfBills() {
        return numberOfBills;
    }

    public void setNumberOfBills(HashMap<Bill, Integer> numberOfBills) {
        this.numberOfBills = numberOfBills;
    }
}
