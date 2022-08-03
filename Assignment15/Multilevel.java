//Program to demonstrate Multilevel Inheritance -->

class Human
    {
        void Play()
        {
           System.out.println("Human play games...");
        }

    }

class Doctor extends Human
    {
        void Patient()
        {
           System.out.println("Doctor treats patient...");
        }

    }

class Medicine extends Doctor
    {
        void Paracetamol()
        {
            System.out.println("Paracetamol reduces high fever...");
        }

    }

public class Multilevel
{
    public static void main(String[] args)
    {
     Medicine e = new Medicine();
     e.Play();
     e.Patient();
     e.Paracetamol();
    }
}