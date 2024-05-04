import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public  static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    
      String play="yes";
      //loop says if we want to play the game again
      while(play.equalsIgnoreCase("yes")){
           Random r = new Random();
           int randomNumber=r.nextInt(100);
           int guessNumber=-1;
          int tries;
         
           tries=0;

           //loop to check if the game is completed or not
           while(guessNumber != randomNumber){
            if(tries<20){
           /*String name=sc.nextLine();
     System.out.println("Hello  "+name+"  welcome to Number Guessing Game");*/
            System.out.println("Guess a Number between 1 and 100: ");
            guessNumber = sc.nextInt();
            tries++;
           if(guessNumber == randomNumber){
                System.out.println("Brilliant! You guessed the correct Number  "+guessNumber);
                System.out.println("You completed your game in  "+tries+"  guesses");
                System.out.println("Would you interested to play the game again ? yes or no:");
                play=sc.next();
            }
            else if( guessNumber > randomNumber){
                System.out.println("you Guessed number is high .try again.");
            }
            else{
                System.out.println("you Guessed number is low .try again.");

            }
           

           }
          
      }
      if(tries==1|| tries==2)
      {
       System.out.println("your score is 100");
      }
     else if(tries<=10){
       System.out.println("your score is 80");
              }
              else{
               System.out.println("your score is 50");

              }

    }

      sc.close();
      }
    }

