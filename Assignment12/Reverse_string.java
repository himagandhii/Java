// Program to reverse a String.

import java.util.Scanner;
public class Reverse_string
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = s.nextLine();
        String rev = "";

        for(int i = input.length()-1; i >= 0; i --)
        {
            rev = rev + input.charAt(i);
        }
        System.out.print("Reversed string: " + rev);
    }
}