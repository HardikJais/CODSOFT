import java.util.*;//importing util package
public class ATM
{
    Scanner sc=new Scanner(System.in);//using scanner class to take the inputs from the user
    public UserBankAccount acc;//creating an instance of UserBankAccount class to create a connection between ATM and UserBankAccount class.
    ATM(UserBankAccount acc)//parametrized constructor
    {
        this.acc=acc;//reference to current object
    }
    public void display()//unparametrized and non returnable function
    {
        System.out.println("Welcome To The ATM!");
        while(true)
        {
            System.out.println("\nChoose the option: \n1-Balance Check \n2-Deposit Money \n3-Withdraw Money \n4-Exit");
            int c=sc.nextInt();//taking user's choice as input
            switch(c)
            {
                case 1:
                    double balance =acc.balancecheck();//calling balancecheck() function of class UserBankAccount to check the available balance
                    System.out.println("Rs."+balance);
                    break;
                case 2:
                    System.out.println("Enter the amount");
                    double amount=sc.nextDouble();//taking user input
                    acc.deposit(amount);//calling deposit() function of class UserBankAccount to check the update the available balance
                    break;
                case 3:
                    System.out.println("Enter the amount");
                    double amount2=sc.nextDouble();//taking user input
                    acc.withdraw(amount2);//calling withdraw() function of class UserBankAccount to check the update the available balance
                    break;
                case 4:
                    System.out.println("Thank You!");
                    sc.close();//closing scanner class to break the interface between the user and terminal window
                    return;
                default:
                    System.out.println("Kindly enter the right choice");
            }
        }
    }
    public static void main(String args[])//main method initialisation
    {
        UserBankAccount ob1=new UserBankAccount(2000.0);//assuming that the account already has a balance of Rs.2000
        ATM ob2=new ATM(ob1);//creating instance of class ATM
        ob2.display();//calling display function using instance of class ATM
    }
}