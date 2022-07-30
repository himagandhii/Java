public class TwoD_array
{
    public static void main(String[] args)
    {
        int [] array1 = { 1, 2, 3};
        int [][] array2 = {{1,2,3,4,} ,{5,6,7,8}};

        for(int i = 0; i < array2.length; i++)
        {
            for(int j = 0; j < array2[i].length; j++)
            {
                System.out.print(array2[i][j] + " ");
            }
        System.out.println();
        }

    }
}