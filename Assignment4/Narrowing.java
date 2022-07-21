public class Narrowing   //explicit converion -> done by user
{
    public static void main(String[] args)
    {
        int ch = 110;
        char i  = (char)ch;           // for converting higher to lower  datatype
        System.out.println(i);       //output will be in form of ASCII codes only
    }
}