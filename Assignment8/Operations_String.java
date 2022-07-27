import java.util.Scanner;
public class Operations_String
{
    public static void main(String[] args)
    {
        String s = "Welcome, today is a beautiful day.";
        String s1 = new String("Java was first released in 1995.");
        String s2 = new String("            It is designed by James Gosling.It is a case sensitive language.");
        String empty = "";
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter some random string: ");
        String input = s3.nextLine();

        System.out.println(s +" "+ s1 +"\n" + s2 );
        System.out.println("You have entered string: " + input);

      // (1) To find ch value at particular index ->ch

        char ch = s.charAt(13);    //ch value at 13 index
        System.out.println("Value of ch at index 13" + ch);     //print ch value

      // (2) To find length of string -> length()

        System.out.println("Length of string s: " + s.length());      //print length value of s string
        System.out.println("Length of string s1: " + s1.length());    //print length value of s1 string
        System.out.println("Length of string s2: " + s2.length());    //print length value of s2 string
        System.out.println("Length of string input: " + input.length());    //print length value of s3 string

      // (3) To find substring in a string ->substring()

        System.out.println("Length of substring: " + s.substring(20,29));
        System.out.println("Length of substring: " + s2.substring(30,43));

      // (4) Contains operation ->contains()

        System.out.println("String contains value beauty: " + s.contains("beauty")); //boolean expression , return True/False
        System.out.println("String contains value Java:" + s1.contains("Java"));

      // (5) To compare strings -> equals()

        System.out.println("String s = String s1: " + s.equals(s1));      //return True/False for equal strings

      // (6) To check if string is empty or not -> isEmpty()

        System.out.println("String empty is has no value: " + empty.isEmpty());  //returns True for empty string

      // (7) To add 2 strings -> concat()

        System.out.println("String s + string 1: " + s.concat(s1));    //adds 2 srtrings

      // (8) To replace char value -> replace(old,new)

        System.out.println("Replaced value: " + s1.replace("J","K"));  //replaces ch with new char

      // (9) To find index of characters -> indexOf(ch)

        System.out.println("Index of character J : " + s1.indexOf("J"));  //to find index of character

      // (10) To convert in lower case -> toLowerCase

        System.out.println("Lower case : " + s.toLowerCase());            // to convert in lower case

      // (11) To convert in upper case -> toUpperCase

        System.out.println("Upper case : " + s.toUpperCase());          //to convert in upper case

      // (12) To remove spaces -> trim()

        System.out.println("After removing spaces : " + s2.trim());    //to remove spaces

      //  (13) To convert different type of data type in string

        float f = 18.28f;
        String s4 = String.valueOf(f);
        System.out.println("Value of : "  + s4 );  //converting float value to string

    }
}
