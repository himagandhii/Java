import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Read
{
    public static void main(String[] args)
    {
        File f1 = new File("C:\\Users\\dell\\Desktop\\Java\\Day19\\Newfile2.txt");
        try
        {
            Scanner s = new Scanner(f1);
            while (s.hasNextLine())
            {
                String content = s.nextLine();
                System.out.println(content);
            }
                s.close();
        }
    catch (FileNotFoundException e)
    {
        System.out.println("Error occured");
        e.printStackTrace();
    }
        System.out.println("File is deleted now: " + f1.delete());    //function to delete file

    }
}