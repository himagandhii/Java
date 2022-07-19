class Fruits{
    int a=5;
}
class Second{
    int x = 5;
    int y = 10;
  final int y1 = 15;     //value of y1 cannot be changed
    public static void main(String[] args)
    {
        Second s = new Second();
        Second s1 = new Second();
        Fruits f = new Fruits();
        f.a= 100;  //new value assigned to object of Fruits class

        System.out.println(s.x);
        System.out.println(f.a);
        System.out.println(s1.x);
        System.out.println(s1.y1);
        System.out.println(s1.y);
    }

}