class Coffee {
    String coffeeName;
    String clientName;
    boolean isCinnamon;

    public Coffee(String coffeeName, String clientName, boolean isCinnamon) {
        this.coffeeName  = "Капучино";
        this.clientName = "Маша";
        this.isCinnamon = true;

    }
}

public class Main {
    public static void main(String[] args) {
       Coffee coffee = new Coffee("Каппучино", "Маша", true);
        coffee.wait();

    }
}