import java.io.FileWriter;
import java.io.IOException;
public class Writer
{
    public static void main(String[] args)
    {
    try{
        FileWriter f = new FileWriter("Newfile1.txt");
        f.write("Hello, Welcome to Java class.");
        f.close();
        System.out.println("Content is successfully written.");
    }
    catch(IOException e)
    {
        System.out.println("Error Occured");
        e.printStackTrace();
    }
}
}