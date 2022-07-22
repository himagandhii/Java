import java.util.Scanner;
public class Star
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        int Number = s.nextInt();                         //input for number of rows for pattern
        System.out.println("\n ### Star Pattern: ###");

        for(int row = 0; row < Number; row++)            //Outer loop for number of rows
        {
            for(int column = 0; column <= row; column++) //Inner loop for number of columns
            {
                System.out.print("* ");                //print * in each column
            }
            System.out.println();                     //print new line after pattern in every line
        }
     }
}