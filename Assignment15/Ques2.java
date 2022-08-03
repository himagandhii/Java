/* Create a class named 'Member' having the following members:
Data Members: Name,Age,Phone Number,Address,Salary. It also has a method named 'printSalary' which prints the
salary of the members. Two classes 'Employee' & 'Manager' inherits the 'Member' class. The 'Employee' & 'Manager'
classes have data members 'specialization' & 'department' respectively. Now, assign name,age,phone number,address
and salary to an employee and a manager by making an object of both these classes and print the same.
*/

class Member
{
     String name;
     int age;
     String PhoneNumber;
     String Address;
     long Salary;

     Member(String name,int age,String PhoneNumber,String Address,long Salary)
     {
         this.name = name;
         this.age = age;
         this.PhoneNumber = PhoneNumber;
         this.Address = Address;
         this.Salary = Salary;
     }
     void printSalary()
     {
      System.out.println("Name: " + name);
      System.out.println("Salary: " + Salary);
     }

}
class Employee extends Member
{
    String specialization;
    Employee(String name,int age,String PhoneNumber,String Address,long Salary,String specialization)
    {
        super(name,age,PhoneNumber,Address,Salary);
        this.specialization = specialization;
    }
}
class Manager extends Member
{
     String department;
     Manager(String name,int age,String PhoneNumber, String Address, long Salary,String department)
    {
        super(name,age,PhoneNumber,Address,Salary);
        this.department = department;
    }
}

   public class Ques2
   {
    public static void main(String[] args)
    {
      Employee e = new Employee("Hima",20, "7000000000","India",100000000,"Musician");
      Manager m = new Manager("V",25,"9000000000","India",100,"CSE");
       e.printSalary();
       m.printSalary();
    }
   }