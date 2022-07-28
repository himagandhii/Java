import java.util.Scanner;
public class ATM_Machine
{

   static int Balance = 0;

    static void withdraw()
      {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter money to be withdrawn: ");
        int amount = s.nextInt();
        if (amount > Balance)
        {
            System.out.println("Sorry, Insufficient Balance :(");
        }
        else
        {
            Balance = Balance - amount;
            System.out.println("Please collect your money: " +amount);
        }
      }

        static void deposit()
      {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter money to be deposited: ");
            int amount2 = s1.nextInt();
            Balance = Balance + amount2;
            System.out.println("Please collect your money: " + amount2);
      }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //options
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Automated Teller Machine :");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");

            //input from user
            System.out.println("Please choose the option you want to perform: ");
            int input = s.nextInt();

            if (input == 1) {
                withdraw();
            } else if (input == 2) {
                deposit();
            } else if (input == 3) {
                System.out.println("Your current balance is: " + Balance);
                System.out.println("Thankyou for using our services. :)");
            } else if (input == 4) {
                System.exit(0);
            } else {
                System.out.println("Please enter a valid choice! ");
            }
        }
    }
}
