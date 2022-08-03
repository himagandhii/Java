/* Create a class named 'Rectangle' with 2 data members : 'length' & 'breadth' and 2 methods to
print the area & perimeter of the rectangle resp. Its constructor having parameters for length &
breadth is used to initialize length & breadth of the rectangle. Let class 'Square' inherit the
'rectangle' class with its constuctor having a parameter for its side(suppose s) calling the constructor
of its parent class as 'super(s,s)'. Print the area & perimeter of a rectangle & a square.
 */

class Rectangle
{
    int length,breadth;
    Rectangle(int l, int b)     //creating parameterized constructor
    {
        this.length = l;
        this.breadth = b;
    }
    void Area()
    {
        System.out.println("Area: ");
        System.out.println(length*breadth);
    }
    void Perimeter()
    {
        System.out.println("Perimeter: ");
        System.out.println(2*(length + breadth));
    }
}

class Square extends Rectangle
{
    Square(int s)
    {
        super(s,s);
    }
}
public class Ques1
{
    public static void main(String[] args )
    {
        Square s = new Square(10);
        Rectangle r = new Rectangle(10,20);
        r.Area();
        r.Perimeter();
        s.Area();
        s.Perimeter();
    }

}
