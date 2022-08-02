//Program to copy elements of 1 array into 2.


import java.util.Scanner;
public class Copy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[100];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }

        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }

        System.out.println("Array elements of 1st array are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Array elements of 2nd array are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }
}
