import java.util.Scanner;

public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number of rows : ");
        int Number = s.nextInt();
        System.out.println("\n ### Pyramid Pattern: ###");

        for(int i = 1; i <= Number; i ++)             //for loop for rows
        {
            for(int j = Number - i; j >= 1; j--)     //j = row - i
            {
                System.out.print(" ");              // print space
            }
            for(int k = 1; k <= i; k++ )
            {
                System.out.print("* ");           //print *
            }
            System.out.println();               //new line
        }

    }

}