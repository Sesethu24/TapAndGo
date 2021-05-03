package tapAndGo;

public class Main {

    public static void main(String[] args) {

        TapAndGo tapCard = new TapAndGo();
        tapCard.deposit(150.00);
        tapCard.pay(100.00);
        tapCard.getBalance();

    }
}
