//Create a program to check whether the user entered number is positive, negative or zero:

import java.util.Scanner;          //imported Scanner to take input from user
public class Hw1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);                //creating object of scanner class
        System.out.println("Please enter the number: ");  //user will enter some  integer value
        int number = s.nextInt();
        System.out.println("You have entered: " + number);

        if(number == 0)
        {
            System.out.println("Given number is zero.");
        }
        else if (number >= 0)
        {
            System.out.println("Given number is positive.");
        }
        else
        {
            System.out.println("Given number is negative.");
        }
    }
}