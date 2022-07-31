//Create a program to count number of vowels,consonants, and spaces in string.

import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = s.nextLine();
        System.out.println("You have entered string: " + input);

        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == 'a' || input.charAt(i)== 'e' || input.charAt(i)== 'i' || input.charAt(i)== 'o' || input.charAt(i)== 'u')
            {
                vowels++;
            }
            else if (input.charAt(i) == ' ')
            {
                spaces++;
            }
            else
                consonants ++;
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of spaces: " + spaces);
    }
}