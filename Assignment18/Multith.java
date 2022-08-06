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
                System.out.println(name + " " + i);
        }
    }
}

public class Multith
{
    public static void main(String[] args)
    {
        Multithread m1 = new Multithread("Thread 1");
        m1.start();
        Multithread m2 = new Multithread("Thread 2");
        m2.start();
    }
}