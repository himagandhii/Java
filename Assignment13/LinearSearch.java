//Program to search a given number in an array using Linear Search.

import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args)
    {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[100];

        System.out.println("Enter array elements: ");
        for(i = 0; i < size; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Array elements are : " );
        for( i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Enter element you want to find : ");
        int num = s.nextInt();

        for(i = 0; i < size; i++)
        {
            if (num == array[i])
            {
                System.out.println("Number found at index: " + i);
                break;
            }
        }
        if ( i == size)
            {
                System.out.println("Number not found");
            }
        }
}