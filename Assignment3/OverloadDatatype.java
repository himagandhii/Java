class OverloadDatatype         //Overloading using different datatypes of parameters
{
    void sum(int a , int b)     //passing variable of int datatype
    {
        System.out.println("Sum of 2 numbers are: " + (a + b) );
    }
    void sum (double a , double b)  //passing variable of double datatype
    {
        System.out.println("Sum of 2 decimal numbers are: " + (a + b));
    }
    public static void main(String[] args)
    {
        OverloadDatatype o1 = new OverloadDatatype();     //creating object
        o1.sum(50,100);                             //calling sum method of int datatype
        o1.sum(10.54,84.5);                         //calling sum method of double datatype
    }
}

