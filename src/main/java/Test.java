import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        FactoryOfBills factoryOfBills = new FactoryOfBills();
         TestClass testClass = new TestClass();
         TestClass testClass1 = new TestClass();
         testClass.decreaseAnInt();
         testClass1.increaseAnInt();

         boolean jest = testClass.getClass().equals(TestClass.class);

        System.out.println(jest);


    }

}
