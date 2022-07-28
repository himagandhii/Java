//Program to make a quiz and output total scores.

import java.util.Scanner;
public class Music_Quiz
{
    static  int scores = 0;
    public static void main(String[] args)
    {
    System.out.println("Hye, Welcome to Hima's Music Quiz. It's a fun quiz consisting of 10 questions of " +
            "popular korean band \"BTS\". ");
    System.out.println("Hope you enjoy the quiz. Best of luck. Let's get started :)  ");
    System.out.println("Please enter your name: ");

    Scanner s = new Scanner(System.in);
    String name = s.nextLine();

    System.out.println("Welcome, " + name );
    System.out.println("Here comes the first Question....");

    //Ques1
    System.out.println("Question 1 : What does Kim Taehyung(V) wanted to become if not a singer ? ");
    System.out.println("Options: ");
    System.out.println("(A) : Dancer");
    System.out.println("(B) : Sexophonist");
    System.out.println("(C) : Farmer");
    System.out.println("(D) : Tennis Player");

   String Ques1 = s.nextLine();
   String ans1 = Ques1.toUpperCase();

    if(ans1.equals("B"))          //Ques1.equals("A")|| Ques1.equals("a")
    {
        System.out.println("Hurray, its a correct answer. Well done. :0 ");
        scores++;
    }
    else
    {
        System.out.println("Oops, its incorrect. Try again.") ;
    }


        //Ques2
        System.out.println("Question 2 : Who is the leader and most fluent in English among BTS members? ");
        System.out.println("Options: ");
        System.out.println("(A) : Jin");
        System.out.println("(B) : Jeon Jungkook");
        System.out.println("(C) : Kim Taehyung (V)");
        System.out.println("(D) : Kim Namjoon (RM)");

        String Ques2 = s.nextLine();

        if(Ques2.equals("D")|| Ques2.equals("d"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques3
        System.out.println("Question 3 :  What is the name given to fans by BTS");
        System.out.println("Options: ");
        System.out.println("(A) : Army");
        System.out.println("(B) : Blinks");
        System.out.println("(C) : Once");
        System.out.println("(D) : Monbebe");

        String Ques3 = s.nextLine();

        if(Ques3.equals("A")|| Ques3.equals("a"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques4
        System.out.println("Question 4 :  How many rappers & vocalists are in BTS");
        System.out.println("Options: ");
        System.out.println("(A) : 2 Rappers, 5 Vocalists");
        System.out.println("(B) : 1 Rappers, 6 Vocalists");
        System.out.println("(C) : 3 Rappers , 4 Vocalists");
        System.out.println("(D) : 3 Rappers, 3 Vocalists");

        String Ques4 = s.nextLine();

        if(Ques4.equals("C")|| Ques4.equals("c"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques5
        System.out.println("Question 5 : Which is the most watched youtube song of BTS? ");
        System.out.println("Options: ");
        System.out.println("(A) : Boy with luv");
        System.out.println("(B) : Dynamite");
        System.out.println("(C) : Life Goes On");
        System.out.println("(D) : Butter");

        String Ques5 = s.nextLine();

        if(Ques5.equals("B")|| Ques5.equals("b"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques6
        System.out.println("Question 6 :  In the historical drama \"Hwarang\" which BTS member debut their acting career?");
        System.out.println("Options: ");
        System.out.println("(A) : Kim Namjoon (RM)");
        System.out.println("(B) : Min Yoongi (Suga)");
        System.out.println("(C) : Park Jimin");
        System.out.println("(D) : Kim Taehyung(V) ");

        String Ques6 = s.nextLine();

        if(Ques6.equals("D")|| Ques6.equals("d"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques7
        System.out.println("Question 7 :  Which BTS member was part of \"Neuron\" dance team");
        System.out.println("Options: ");
        System.out.println("(A) : Jeon JUngkook");
        System.out.println("(B) : Kim Taehyung (V) ");
        System.out.println("(C) : Park Jimin ");
        System.out.println("(D) : Jung Hoseok (J-Hope)\"");

        String Ques7 = s.nextLine();

        if(Ques7.equals("D")|| Ques7.equals("d"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques8
        System.out.println("Question 8 : Who is called the most handsome man on Earth from BTS group? ");
        System.out.println("Options: ");
        System.out.println("(A) : Jeon Jungkook");
        System.out.println("(B) : Kim Taehyung (V)");
        System.out.println("(C) : Park Jimin ");
        System.out.println("(D) : Min Yoongi (Suga)");

        String Ques8 = s.nextLine();

        if(Ques8.equals("B")|| Ques8.equals("b"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques9
        System.out.println("Question 9 : Which music video first reached 100 million views on Youtube? ");
        System.out.println("Options: ");
        System.out.println("(A) : Mic Drop");
        System.out.println("(B) : Butter");
        System.out.println("(C) : Dope");
        System.out.println("(D) : Blood, Sweat & Tears");

        String Ques9 = s.nextLine();

        if(Ques9.equals("D")|| Ques9.equals("d"))
        {
            System.out.println("Hurray, its a correct answer. Well done. :0 ");
            scores++;
        }
        else
        {
            System.out.println("Oops, its incorrect. Try again.") ;
        }

        //Ques10
        System.out.println("Question 10 : Are you an ARMY?  ");
        System.out.println("Options: ");
        System.out.println("(A) : Yes ");
        System.out.println("(B) : No");
        System.out.println("(C) : Yes, i like bts but not an army");
        System.out.println("(D) : I am die hard fan of BTS :) ");

        String Ques10 = s.nextLine();

        if(Ques10.equals("A")|| Ques10.equals("a") || Ques10.equals("C")|| Ques10.equals("c") ||  Ques10.equals("D")|| Ques10.equals("d"))
        {
            System.out.println("Well done, ARMY :0 .Hope you enjoyed the quiz ");
        }
        else
        {
            System.out.println("Hope you enjoyed the quiz.") ;
        }

        System.out.println("Your total scores are : " + scores +"/9");
    }

}