public class AccountWithdraw  {
    void withdraw(int amount, int balance) throws Account {
        if(amount > balance)
        {
            throw new Account("Balance is insuffient");
        }
    }
}
