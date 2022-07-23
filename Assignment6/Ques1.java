public class Ques1
{
    public static void main(String[] args) {
        int c = 35;
        for (int i = 0; i <= 10; i++) {
            c = c - 1;
            if (i == 2) {
                break;
            }
        }
            System.out.println(c);   //out of loop

    }
}