// Program to take input of rows and columns from user.
//Take input of array elements from user.
//Print the array.

import java.util.Scanner;
public class Scan_array
{
    public static void main(String[] args)
    {

        System.out.println("Enter number of rows: ");
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();

        System.out.println("Enter number of columns: ");
        int column = s.nextInt();

        System.out.println("Enter 2-D array numbers: ");
        int array[][] = new int[rows][column];
        for(int i = 0; i < rows; i++)
        {
            for( int j = 0; j < column; j++)
            {
                array[i][j] = s.nextInt();
            }
        }

        System.out.println("Array: ");
        for(int i = 0; i < rows; i++)
        {
            for( int j = 0; j < column; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}