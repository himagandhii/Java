import java.util.*;
public class Scan
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<String>();

        System.out.println("Enter Arraylist elements: ");
        for(int i = 0; i <= 5; i++)
        {
            List.add(s.nextLine());
        }
        System.out.println(List);
    }
}

