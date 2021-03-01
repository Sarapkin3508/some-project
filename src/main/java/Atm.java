import java.util.*;
import java.util.function.Function;

public class Atm {

    private int balance;
  //  private HashMap<Bill, Integer> numberOfBills;
    private List<Bill> listOfBills;


    public Atm(int balance,List<Bill> listOfBills) {

        this.balance = balance;
        this.listOfBills = listOfBills;
    }



    public void giveMoney(int countOfMoney, List<Bill> listOfBills) {
        if (this.balance < countOfMoney) {
            System.out.println("В банкомате недостаточно средств");

        } else {
            FactoryOfBills factoryOfBills = new FactoryOfBills();
            int countOfGiven = 0;



            boolean flag100 = false;
            boolean flag50 = false;
            boolean flag20 = false;
            boolean flag10 = false;

           do {
                Bill maxBills = new BillOf5();
                System.out.println(countOfMoney - countOfGiven);
                System.out.println(listOfBills);

                boolean flag5 = false;


                    for (Bill itVar : listOfBills) {

                        if (itVar.numberOfBills() > maxBills.numberOfBills() && itVar.numberOfBills() < countOfMoney - countOfGiven) {
                            maxBills = itVar;
                        }
                    }

                    countOfGiven = maxBills.addBill(countOfGiven);
                    factoryOfBills.changeCountOfBills(maxBills);
                    System.out.println("Выдана купюра " + maxBills);

                if (countOfMoney - countOfGiven <= 100 && flag100 == false ) {
                    listOfBills.remove(4);
                    flag100 = true;
                    System.out.println();
                }
                if (countOfMoney - countOfGiven <= 50 && flag50 == false ) {
                    listOfBills.remove(3);
                    flag50 = true;
                }
                if (countOfMoney - countOfGiven <= 20 && flag20 == false) {
                    listOfBills.remove(2);
                    flag20= true;
                }
                if (countOfMoney - countOfGiven <= 10 && flag10 == false) {
                    listOfBills.remove(1);
                    flag10 = true;
                }


                }while (countOfMoney >= countOfGiven + 5);
                System.out.println("Выдано всего: " + countOfGiven);
                System.out.println("Купюр осталось: " + "\n" + BillOf5.countOfBills5 + " купюр - номинала 5" + "\n" +
                        BillOf10.countOfBills10 + " купюр - номинала 10" + "\n" +
                        BillOf20.countOfBills20 + " купюр - номинала 20" + "\n" +
                        BillOf50.countOfBills50 + " купюр - номинала 50" + "\n" +
                        BillOf100.countOfBills100 + " купюр - номинала 100" + "\n");
            }


        }


    public void debitMoney(Bill bill){

    }

    public void findMin(HashMap<Bill, Integer> numberOfBills){

    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
