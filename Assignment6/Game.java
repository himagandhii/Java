// Create a stone paper scissor game with if else statements.
// Take input from 2 players.
// And print the results.
//Rules: (1) From Rock and Scissor -> Rock wins.
//       (2) From Paper and Rock -> Paper wins.
//       (3) From Scissor and Paper -> Scissor wins.


import java.util.Scanner;
public class Game
{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int P1 = 0;          //initializing P1
        int P2 = 0;          //initializing P2
        for (int i = 1; i <= 5; i++)        //for loop ->5 times
        {

            System.out.println("Enter your choice:" + "\n" + "1 : Rock, 2 : Paper, 3 : Scissor");
            System.out.println("Player 1 -> Enter first Move: Rock/Paper/Scissor");
            int Play1 = s.nextInt();                                                        //Choice of User 1

            System.out.println("Player 2 -> Enter first Move: Rock/Paper/Scissor");
            int Play2 = s.nextInt();                                                        //Choice of User 2

            if (Play1 == Play2)                                                              //Rock = Rock
            {
                System.out.println("Game is Tie :0");
            } else if (Play1 == 1 && Play2 == 2)                                              //Rock - Paper (Paper wins)
            {
                System.out.println("Player 1 wins");
                P1++;
            } else if (Play1 == 2 && Play2 == 1)                                              //Paper - Rock (Paper wins) Scissor (Scissor wins)
            {
                System.out.println("Player 1 wins");
                P1++;
            } else if (Play1 == 2 && Play2 == 3)                                             //Paper - Scissor (Scissor wins)
            {
                System.out.println("Player 2 wins");
                P2++;
            } else if (Play1 == 3 && Play2 == 2)                                              //Scissor - Paper (Scissor wins)
            {
                System.out.println("Player 1 wins");
                P1++;
            } else if (Play1 == 1 && Play2 == 3)                                              //Rock - Scissor (Rock wins)
            {
                System.out.println("Player 1 wins");
                P1++;
            } else {
                System.out.println("Player 2 wins");                                       //Scissor - Rock (Rock wins)
                P2++;
            }
        }
        if(P1 == P2)     //One with more scores is winner
        {
            System.out.println("The game is a tie. Player1 have " + P1 + " points. Player2 have " + P2 + " points.");
        }

        else if (P1 > P2) {
            System.out.println("Congratulations, Player is the winner having " + P1 + " points.");
        }
        else {
            System.out.println("Congratulations, P2 is the winner having " + P2 + " points.s");
        }

}}
