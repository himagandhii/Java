import java.util.Scanner;

public class SumNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number you want to Sum: ");
        int Number = s.nextInt();                                //input digits
        System.out.println("You have entered: " + Number);

        int Sum = 0;                                            //initializing Sum = 0
        while(Number != 0)
        {
            int remainder = Number % 10;                       //find remainder
            Sum = Sum + remainder;                             //remainder is added everytime in sum value
            Number = Number /10;                               //number is divided ny 10
        }
        System.out.println("Your Sum is: " + Sum);            //print sum of digits
    }
}

