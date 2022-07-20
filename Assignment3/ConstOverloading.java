class ConstOverloading
      {
          String name;
          int id;
          int age;

          ConstOverloading(String n, int i)
          {
              name = n;
              id = i;
          }
          ConstOverloading(String n, int i, int a)
          {
             name = n;
             id = i;
             age = a;
          }

          void Display()
          {
              System.out.println("Name: " + name + ", Id: " + id + ", Age: " + age) ;
          }
          public static void main(String[] args)
          {
              ConstOverloading p1 = new ConstOverloading("Hima", 2001);
              ConstOverloading p2 = new ConstOverloading("Hima", 2002, 20);
              p1.Display();
              p2.Display();
          }
      }

