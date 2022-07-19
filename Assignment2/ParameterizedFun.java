public class ParameterizedFun
{
    void method()
    {
        System.out.println("Hey");
    }
    void name(String firstname, int age)
    {
        System.out.println("Welcome " + firstname + ".Your age is: " + age);
    }
    static int value(int x, int y)
    {
        return x+y;
    }
    public static void main(String[] args){
        ParameterizedFun f = new ParameterizedFun();
        f.method();
        System.out.println("Value of x is: "+ value(10,20));
        f.name("Hima",20);
        f.name("Lea", 21);
    }
}
