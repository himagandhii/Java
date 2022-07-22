public class Whileloop            //entry controlled loop
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i<10)                 //used when iterations are not fixed
        {
            System.out.println(i);  //runs until the condition is false
            i++;                    //stopping condiotion otherwise value be 1 on infinite loop
        }
    }
}