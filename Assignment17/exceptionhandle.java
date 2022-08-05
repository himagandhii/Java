public class exceptionhandle
{
    public static void main(String[] args)
    {
        try
        {
            int data = 100/5;
            int a[] = new int[5];
            a[8] = 12;
            a[5] = 30/8;
        }
        catch (ArithmeticException e )
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Hey!!");
        }
            System.out.println("Rest of code");
            System.out.println("Hey, What's Up");
    }
}