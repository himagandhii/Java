// Consider first N even natural numbers starting from zero(0).
// Complete the code segment to calculate sum of all the natural numbers divisible by 3 from 0 to n.
// Print the sum.

import java.util.Scanner;
class Task1
{
    public static void main(String[] args)
    {
        System.out.println("Please enter number: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int sum = 0;                                 //initializing sum to 0

        for(int i = 0; i < input * 2 ; i+=2 )        //for loop -> even numbers till input number
        {
            {
                System.out.println(i + "\t");    //print the numbers
            }

               if( i % 3 == 0)                  //check which even numbers are divisible by 3
                   {
                        sum = sum + i;               //adding sum
                   }
        }
        System.out.println("Sum is : " + sum);   //print sum of all the even natural numbers divible by 3
    }
}
