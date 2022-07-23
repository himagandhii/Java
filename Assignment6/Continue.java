public class Continue
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)  //for loop
        {
            if (i == 8)               //condition to be skipped
            {
                continue;             //skip this number
            }
            System.out.println(i);    //print loop
        }
    }
}