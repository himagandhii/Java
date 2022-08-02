//Program to print Maximum and minimum elements of array.


import java.util.Scanner;
public class Max_Min {
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
        int max = 0, min = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];

            if (array[i] < min)
                min = array[i];
        }
        System.out.println("The smallest value is: " + min);
        System.out.print("The largest value is: " + max);
    }
}
