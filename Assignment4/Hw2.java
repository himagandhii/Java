// Create a grading system where we take an input from the user about marks and assign the grades according to it.
// It can be A, B, C, D, E ,F for fail grade.
// Using switch case.

import java.util.Scanner;
public class Hw2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter marks of the student: ");
        float marks = s.nextFloat();
        System.out.println("Yoh have scored " + marks + " marks.");

        switch ((int)marks/10)      //converting value into single digit number...switch case only takes int/char values
        {
            case (9):
                System.out.println("Congratulations, Yoh have scored an A grade. Well done :)");
                break;              // keyword used to break control and cme out of switch case
                case (8):
                System.out.println("Congratulations, Yoh have scored a B grade. Well done :)");
                break;
            case (7):
                System.out.println("You have scored a C grade. Work hard next time :)");
                break;
            case (6):
                System.out.println("You have scored a D grade. Work hard next time :)");
                break;
            case (5):
                System.out.println("You have scored an E grade. Work hard next time :)");
                break;
            default:
                System.out.println("You have scored a F grade. You are not eligible for this course :(");
                break;
        }
    }
}
