//Program to print elements of array present at even & odd positions.


import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[100];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("Array elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array elements present at even position : ");
        for (int i = 1; i < size; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array elements present at odd position : ");
        for (int i = 0; i < size; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
