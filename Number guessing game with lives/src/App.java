import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int lives;
        int diff;
        int number = 0;
        int answer;
        boolean playerWon = false;

        System.out.println("Welcome to my number guessing game!!");
        System.out.print("Please enter how much lives you'll have: ");
        lives = sc.nextInt();
        System.out.println("Please select a difficulty!");
        System.out.println(">1. EASY");
        System.out.println(">2. NORMAL");
        System.out.println(">3. HARD");
        System.out.println(">4. INSANE");
        diff = sc.nextInt();

        while(diff != 1 && diff != 2 && diff != 3 && diff != 4)
        {
            System.out.println("INVALID INPUT!");
            System.out.println("Please select a difficulty!");
            System.out.println(">1. EASY");
            System.out.println(">2. NORMAL");
            System.out.println(">3. HARD");
            System.out.println(">4. INSANE");
            diff = sc.nextInt();
        }
        if(diff == 1)
        {
            number = r.nextInt(20) +1;
        }
        else if(diff == 2)
        {
            number = r.nextInt(100) +1;
        }
        else if(diff == 3)
        {
            number = r.nextInt(500) +1;
        }
        else if(diff == 4)
        {
            number = r.nextInt(1000) +1;
        }

        for(int i = lives; i > 0; i--)
        {
            System.out.printf("Current lives: %d\n", i);
            
            if(diff == 1)
            {
                System.out.print("Guess the number ranging from 1 to 20!: ");
                answer = sc.nextInt();

                if(answer == number)
                {
                    System.out.println("Correct!");
                    playerWon = true;
                    break;
                }
                else if(answer > number)
                {
                    System.out.println("TOO HIGH!");
                }
                else if(answer < number)
                {
                    System.out.println("TOO LOW!");
                }
            }
            else if(diff == 2)
            {
                System.out.print("Guess the number ranging from 1 to 100!: ");
                answer = sc.nextInt();

                if(answer == number)
                {
                    System.out.println("Correct!");
                    playerWon = true;
                    break;
                }
                else if(answer > number)
                {
                    System.out.println("TOO HIGH!");
                }
                else if(answer < number)
                {
                    System.out.println("TOO LOW!");
                }   
            }
            else if(diff == 3)
            {
                System.out.print("Guess the number ranging from 1 to 500!: ");
                answer = sc.nextInt();

                if(answer == number)
                {
                    System.out.println("Correct!");
                    playerWon = true;
                    break;
                }
                else if(answer > number)
                {
                    System.out.println("TOO HIGH!");
                }
                else if(answer < number)
                {
                    System.out.println("TOO LOW!");
                }
            }
            else if(diff == 4)
            {
                System.out.print("Guess the number ranging from 1 to 1000!: ");
                answer = sc.nextInt();

                if(answer == number)
                {
                    System.out.println("Correct!");
                    playerWon = true;
                    break;
                }
                else if(answer > number)
                {
                    System.out.println("TOO HIGH!");
                }
                else if(answer < number)
                {
                    System.out.println("TOO LOW!");
                }
            }
        }
        if(!playerWon)
        {
            System.out.println("GAME OVER!");
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
