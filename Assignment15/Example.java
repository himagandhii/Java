//Simple example:

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
    String color = "Green";
    void bark()
    {
        System.out.println("Barking");
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Example
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        System.out.println(d.color);
        d.eat();
        d.bark();
    }
}