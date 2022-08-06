class Mythread implements Runnable
{

  String name;
  Mythread(String n)
  {
      name = n;
  }
    @Override
      public void run()
      {
          for (int i = 0; i <= 10; i++)
          {
             System.out.println(name + " " +i);
          }
  }
          void startThread()
          {
              Thread t = new Thread(this);
              Thread t2 = new Thread(this);
              t2.start();
              t.start();
          }
}
public class Threading_interface
{
    public static void main(String[] args)
    {
        Mythread r = new Mythread("Thread: ");
        r.startThread();
    }
}