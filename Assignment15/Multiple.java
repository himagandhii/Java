//Program to demonstrate Multiple Inheritance -->

//This program gives compile time error :(
class A
    {
        void msg()
        {
            System.out.println("This is class A.");
        }
    }

class B
{
    void msg()
    {
        System.out.println("This is class B.");
    }
}

class C extends A,B
{
    public static void main(String[] args)
    {
       C c = new C();
       c.msg();
    }
}