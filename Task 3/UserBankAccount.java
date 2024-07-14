public class UserBankAccount
{
    public double balance;
    UserBankAccount(double balance)
    {
        this.balance=balance;        
    }
    public double balancecheck()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Rs."+amount+" has been successfully deposited in your account.");
        }
        else
        {
            System.out.println("#404 error");
        }
    }
    public void withdraw(double amount)
    {
        if(amount<=balance&&amount>0)
        {
            balance-=amount;
            System.out.println("Rs."+amount+" has been withdrawn from your account.");
        }
        else
        {
            if(amount>balance)
            System.out.println("Error! Kindly check the available balance in your account.");
            else
            System.out.println("#404 error");
        }
    }
}