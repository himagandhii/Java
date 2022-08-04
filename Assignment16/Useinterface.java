//Use of interfaces -->
// 1. Abstraction
// 2. Multiple Inheritance
interface Music
{
    void play();
}
class Piano implements Music
{
    public void play()
    {
        System.out.println("Piano is playing...");
    }
}
class Sitar implements Music
{
    public void play()
    {
        System.out.println("Sitar is playing...");
    }
}
class Useinterface
{
    public static void main(String[] args)
    {
        Music m = new Piano();
        m.play();
        Music m1 = new Sitar();
        m1.play();
    }
}
