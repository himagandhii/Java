class UseFun{
    void method(){
        System.out.println("Hy, We are learning Functions");
        }
    void method1()
    {
        System.out.println("This is our Second Day of Java class.");
    }
}
class Function{
     static void method2()       //for static we dont create objects
    {
        System.out.println("Java was called Oak in the beginning.");
    }
    public static void main(String[] args)
    {
      UseFun m = new UseFun();  //creating object for UseFun class
      m.method1();
      m.method();
      method2();
    }
}
