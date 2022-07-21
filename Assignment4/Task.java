import java.util.Scanner;   //importing to take input from user
public class Task
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); //object created of scanner class ->s

        System.out.println("Please enter a character: ");
        String Char = s.nextLine();  //user will enter input

       System.out.println("You have entered: " + Char);
       switch(Char)
        {
            case "a"  :
                System.out.println("It is a vowel.");
                break;

            case "e"  :
                System.out.println("It is a vowel.");
                break;
            case "i":
                System.out.println("It is a vowel.");
                break;
            case "o" :
                System.out.println("It is a vowel.");
                break;
            case "u" :
                System.out.println("It is a vowel.");
                break;

            case "A"  :
                System.out.println("It is a vowel.");
                break;
            case "E"  :
                System.out.println("It is a vowel.");
                break;
            case "I":
                System.out.println("It is a vowel.");
                break;
            case "O" :
                System.out.println("It is a vowel.");
                break;
            case "U" :
                System.out.println("It is a vowel.");
                break;

            default:
                System.out.println("It is a consonant.");  //by default anything else will go to default
        }
    }
}