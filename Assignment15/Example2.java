//Using multilevel inherience & demonstate use of super keywork -->

class Animal
{
    String color = "Red";
    void eat()
    {
        System.out.println("Eating");
    }

}

class Dog extends Animal
{
    String color = "Brown";
    void bark()
    {
        System.out.println("Barking");
        System.out.println("Color of dog class: " +color);
        System.out.println("Color of super class of dog class: " + super.color);
    }
}

class Cat extends Dog
{
    String color = "Black";
    void meow()
    {
        System.out.println("Meowing");
        System.out.println("Color of cat class: " + color);
        System.out.println("Color of super class of dog class: " + super.color);
    }
}

public class Example2
{
    public static void main(String[] args)
    {
        Cat c = new Cat();
        System.out.println("Object: " + c.color);
        c.eat();
        c.bark();
        c.meow();
    }
}