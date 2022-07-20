class Overload         // Overloading using different variables/parameters
{
    void area (int r)        //paasing 1 variable
    {
        System.out.println("Area of circle: " + 3.14 * r * r);     //to find area of circle
    }

    void area (int l, int b)  //passing different variables
    {
        System.out.println("Area of rectangle: " + l * b);
    }
    public static void main(String[] args)
    {
        Overload o1 = new Overload();  //creating object
        o1.area(5);                  //calling area method with 1 parameter
        o1.area(5,10);            //calling area method with 2 parameters passed
    }
}