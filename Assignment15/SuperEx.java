//Program to demonstrate SUPER Keyword in java -->

class Animal
        {
            String color = "Red";
            void eat()
                {
                  System.out.println("Animal class Eat");
                }
        }
class Dog extends Animal
        {
            String color = "Green";
             void eat()
                 {
                   System.out.println("Dog class Eat");
                 }

             void bark()
                {
                  eat();
                  super.eat();
                  System.out.println("Barking");
                  System.out.println("Using super: " +super.color);
                  System.out.println(color);

                }
        }

public class SuperEx
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.bark();
    }
}

