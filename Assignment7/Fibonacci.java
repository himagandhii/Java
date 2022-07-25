import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci Series: ");
        int Number = s.nextInt();
        int fib1 = 0;                                      //initializing 1 value = 0
        int fib2 = 1;                                      //initializing 2 value = 1
        System.out.print( "Fibonacci Series: "+fib1+" " + fib2);  //print 1 & 2 value
        for(int i = 2; i < Number; i++)                    //for loop till Number
        {
           int series = fib1 + fib2;                      //sum of next 2 numbers
           System.out.print( " " + series);               //print series
           fib1 = fib2;                                   //swap 1st & 2nd value
           fib2 =series;                                  //swap 2nd & series value
        }
    }
}