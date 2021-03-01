public class TestClass {
public static int anInt = 0;
    public TestClass() {
    }

    public static int getAnInt() {
        return anInt;
    }

    public static void setAnInt(int anInt) {
        TestClass.anInt = anInt;
    }

    public void decreaseAnInt(){
        anInt = anInt - 1;
    }

    public void increaseAnInt(){
        anInt = anInt + 1;
    }


}
