package testtest;

public class MethodOverloading {
    void showInt(int i1) {
        System.out.println(i1);
    }
}
class MethodOverloadingTest {
    public static void main (String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.showInt(100);
    }
}
