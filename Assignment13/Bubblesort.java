//Program to sort array is ascending order.

import java.util.Scanner;
public class Bubblesort
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int temp;

        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[100];

        System.out.println("Enter numbers to be sorted: ");
        for(int i = 0; i < size; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Sorted array:");
        for (int k = 0; k < size; k++)
        {
            for(int j = k+1; j < size; j++)
            {
                if (array[k] > array[j])
                {
                    temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[k]+"  ");
        }
    }
}