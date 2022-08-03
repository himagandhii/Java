//Program to demonstrate Hierarchial Inheritance -->

class Student
{
    void study()
    {
        System.out.println("Student is studing...");
    }

}

class Science extends Student
{
    void test()
    {
        System.out.println("Science student studies chemisty, physics, biology...");
    }

}

class Commerce extends Student
{
    void test1()
    {
        System.out.println("Commerce student studies economics, accounts, mathematics...");
    }

}

public class Hierarchial
{
    public static void main(String[] args)
    {
        Science s = new Science();
        Commerce c = new Commerce();
        s.study();
        s.test();
        c.study();
        c.test1();
    }
}