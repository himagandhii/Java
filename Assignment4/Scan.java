import java.util.Scanner;        //to take input user we have to import Scanner package
public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //object of scanner class and arguments passed to take user input

        System.out.println("Please enter Username: ");
        String User = s.nextLine();          //for taking user input in String form

        System.out.println("Please enter Age: ");
        int Age = s.nextInt();

        System.out.println("Username: " + User + " " + ",Age: " + Age);

    }
}