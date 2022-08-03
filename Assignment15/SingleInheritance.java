//We use inheritance to derive features of parent into child class.
//Feature : Reusability
//We use extends keyword

//Program to demonstrate Single Inheritance -->

class Music
        {
            void Piano()
            {
                System.out.println("Piano is playing..");
            }
        }
class ClassicalMusic extends Music
        {
            void sitar()
            {
                System.out.println("Sitar is playing...");
            }
        }
class SingleInheritance
{
    public static void main(String[] args)
    {
        ClassicalMusic c = new ClassicalMusic();
        c.Piano();
        c.sitar();
    }

}

