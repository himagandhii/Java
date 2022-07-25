import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number you want to reverse: ");
        int Number = s.nextInt();                                //input digits
        System.out.println("You have entered: " + Number);

        int reverse = 0;                                          //initializing reverse value = 0
        while (Number != 0)
        {
            int remainder = Number % 10;                          //find remainder
            reverse = reverse * 10 + remainder;                   // storing reverse values
            Number = Number / 10;                                 //Number divided by 10 after remainder found
        }
        System.out.println("Reversed Number is: " + reverse);     // print reverse digits
    }
}



