//Program to search a given number in an array using Binary Search.

import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int temp, i, size;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        size = s.nextInt();
        int[] array = new int[size];

        System.out.println("Enter numbers to be sorted: ");
        for (i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Sorted array:");
        for (int k = 0; k < size; k++) {
            for (int j = k + 1; j < size; j++) {
                if (array[k] > array[j]) {
                    temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[k] + "  ");
        }
        System.out.println();


        System.out.println("Enter element you want to find : ");
        int key = s.nextInt();

        int first = 0;
        int end = size;


        while (first <= end)
        {
            int mid = (first +  end) / 2;
            if (key == array[mid])
            {
                System.out.println("Element found at position " + mid);
                break;
            }

        else if (key > array[mid])
            {
                first = mid + 1;
            }
        else
                {
                end = mid - 1;
                }

        }

        if (first > end) {
            System.out.println("Number not found");
        }

    }
}

