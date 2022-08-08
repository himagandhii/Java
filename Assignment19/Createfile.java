import java.io.File;
import java.io.IOException;

public class Createfile
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("C:\\Users\\dell\\Desktop\\Java\\Day19\\Newfile.txt");
            if(f.createNewFile())
            {
                System.out.println("File" + f.getName() + " is created.");
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            System.out.println("An unexpected error occured.");
            e.printStackTrace();
        }
    }
}