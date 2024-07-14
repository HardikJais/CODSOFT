import java.util.*;
class NumberGame
{
    public static void main(String args[])
    {
        Random randobj=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Number Game! \nYou have 10 attempts to guess the number.");
        char play='y';
        while(play=='y'||play=='Y')
        {
            int minrange=1;
            int maxrange=100;
            int maxattempt=10;//providing the player with 10 attempts
            int attempt=1;
            int attemptsleft=0;
            int randomnum=randobj.nextInt(maxrange-minrange+1)+minrange;
            int total_score=100;
            while(attempt<=10)
            {
                    System.out.println();
                    System.out.println("Attempt No: "+attempt);
                    System.out.println("Guess the number between "+minrange+" and "+maxrange);
                    int guessnum=sc.nextInt();
                    if(guessnum<1||guessnum>100)
                    System.out.println("OOPS! The number you guessed is out of range. ");
                    else if(guessnum>randomnum) 
                    System.out.println("Too High!");
                    else if(guessnum<randomnum)
                    System.out.println("To Low!");
                    else 
                    {
                        System.out.println("Congratulations! You guessed the right number.");
                        break;
                    }
                    attemptsleft=maxattempt-attempt;
                    total_score=total_score-10;
                    attempt++;
                    if (attempt>maxattempt) {
                    System.out.println("Sorry, You have no attempts left. The correct number was " + randomnum + ".");
                    break;
                    }
                    else
                    {
                    System.out.println("Attempts remaining: " + (attemptsleft));
                    }
            }
            System.out.println("Your score for this round is "+total_score);
            System.out.println();
            System.out.println("Do you want to play another round : Y or N");
            char ch=sc.next().charAt(0);
            play=ch;
        }   
        System.out.println();
        System.out.println("|| GAME OVER ||");
    }
}
