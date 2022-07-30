public class OneD_array
{
    public static void main(String[] args)
    {
        int array[] = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;


        for(int i = 0; i < array.length; i++)
        {
            System.out.print( array[i]+ " ");
        }
        System.out.println();
        System.out.println("Element at index 3: " + array[3]);

        String cars[] = {"Volvo","BMW", "Mercedes" };
        for(int i = 0; i < cars.length; i ++)
        {
            System.out.print(cars[i] + " ");
        }
        cars[2] = "Toyota";
        System.out.println();
        for(int i = 0; i < cars.length; i ++)
        {

            System.out.print(cars[i] + " ");
        }
    }
}