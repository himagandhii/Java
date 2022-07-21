public class Nested_ifelse
{
    public static void main(String[] args)
    {
        int Age = 25;
        int Weight = 58;
        if (Age >= 18)
        {
            if (Weight >= 50)
            {
                System.out.println("Congrats, Yor are eligible to donate Blood.");
            }
            else
            {
                System.out.println("Sorry, you are not eligible to donate Blood.");
            }
        }
        else
        {
            System.out.println("Your age must be greater than 18.");
        }
    }
}