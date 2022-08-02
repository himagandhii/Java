//Program to sum all the elements in an array.

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[100];

        System.out.println("Enter array elements: ");
        for (i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Array elements are : ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.print("Sum of array elements are: " + sum);
    }
}

