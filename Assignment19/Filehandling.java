import java.io.File;
import java.io.IOException;

public class Filehandling
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\dell\\Desktop\\Java\\Day19\\Newfile.txt");
        try
        {
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
        if (f.exists())
            {
                System.out.println("The name of file is " + f.getName());
            }
        System.out.println("The path of file is: " + f.getAbsolutePath());
        System.out.println("To check if we can write in the file or not: " + f.canWrite()); //boolean function
        System.out.println("To check if we can read file or not: " + f.canRead());          //boolean function
        System.out.println("The length of file is: " + f.length());

    }
}