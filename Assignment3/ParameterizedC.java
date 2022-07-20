class ParameterizedC
{
    String name;
    int id;

    ParameterizedC(String n, int i)
    {
        name = n;
        id = i;
    }

    void Display()
    {
        System.out.println("Name: " + name + " Id: " + id);
    }
    public static void main(String[] args)
    {
        ParameterizedC p1 = new ParameterizedC("Hima", 2001);
        ParameterizedC p2 = new ParameterizedC("Hima", 2002);
        p1.Display();
        p2.Display();
    }
}