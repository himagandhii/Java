// Create a stone paper scissor game with if else statements.
// Take input from 2 players.
// And print the results.
//Rules: (1) From Rock and Scissor -> Rock wins.
//       (2) From Paper and Rock -> Paper wins
//       (3) From Scissor and Paper -> Scissor wins


import java.util.Scanner;
public class Hw3
{
    static final String Rock = "Rock";     //static: no need to create object
    static final String Paper = "Paper";   //final: Value of string cant be changed furthur
    static final String Scissor = "Scissor";

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Player 1 -> Enter first Move: Rock/Paper/Scissor");
        String moveOne = s.nextLine();  //Choice of User 1

        System.out.println("Player 2 -> Enter first Move: Rock/Paper/Scissor");
        String moveTwo = s.nextLine();  //Choice of User 2

        if (moveOne.equals(moveTwo))    //Rock = Rock
        {
            System.out.println("Game is Tie");
        }
        else if (moveOne.equals(Hw3.Rock))   //Rock - Paper (Paper wins)
        {
            System.out.println(moveTwo.equals(Hw3.Paper)? "Player 2 wins" : "Player 1 wins");
            // ? is used for condition
        }
        else if (moveOne.equals(Hw3.Paper))   //Paper - Scissor (Scissor wins)
        {
            System.out.println(moveTwo.equals(Hw3.Scissor)? "Player 2 wins" : "Player 1 wins");

        }
        else                                  //Scissor - Rock (Rock wins)
        {
            System.out.println(moveTwo.equals(Hw3.Rock)? "Player 2 wins" : "Player 1 wins");
        }
}
}