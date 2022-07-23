public class Ques3
{
    public static void main(String[] args)
    {
        int sum = 0;
        int i = 10;
       while (i >= 0) {
           sum = sum + i;
           i = i - 2;
           if (i == 4) {
               continue;
           }
           System.out.println("Value of i: " + i);
       }
            System.out.println("Value of sum: " + sum);

    }
}