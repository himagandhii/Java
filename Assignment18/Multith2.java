import java.lang.Thread;
class Multithread extends Thread
{
    String name;
    Multithread(String n)  //parameterized constructor
    {
        name = n;
    }
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            try
            {
                Thread.sleep(2500);     //time in milliseconds
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(name + " " + i);
        }
    }
}
public class Multith2
{
    public static void main(String[] args)
    {
        Multithread m1 = new Multithread("Thread 1");
        m1.start();
        Multithread m2 = new Multithread("Thread 2");
        m2.start();
    }
}