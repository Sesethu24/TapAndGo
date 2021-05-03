package tapAndGo;

public class TapAndGo {

    double balance;

    public void pay(double amount)
    {
        if (amount > balance)
        {
            System.out.println("You have insufficient funds for this purchase!" );
        }
        else
          {
            balance = balance - amount;
            System.out.println("You just used your card to pay" + " "+"R"+ amount);
          }
    }
    public void deposit(double amountDeposit)
    {
         balance = amountDeposit + balance;
         System.out.println( "R" + balance + " has been deposited into your account");
    }
        public void getBalance()
        {
            System.out.println("Your balance is" + " " + "R" + balance);
        }


}
