import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

      
        int lowerBound = 1;
        int upperBound = 100;       
      
        int maxTrials=15;
        int rounds=0;
        int totalScore=0;  

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("------------------------------------");
           do{ 
       
            boolean CorrectGuess = false;
            rounds++; 
       
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
            int Trials = 0; 
            System.out.println("ROUND:"+rounds);
            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);
        
        while (!CorrectGuess && Trials<=maxTrials) {
            System.out.print("Guess the number: ");
            int UserInput = input.nextInt();
            Trials++;  //
          
            if (UserInput < secretNumber) {
                System.out.println("Too low! Try again.");
            } 
            else if (UserInput > secretNumber) {
                System.out.println("Too high! Try again.");
            } 
            else{
                
                System.out.println("Congratulations! You've guessed the  secret number ("+secretNumber+") correctly");
                CorrectGuess = true;  // Set to true to exit the loop
            }
        }
        if(CorrectGuess){
            totalScore++;
            if (Trials <= 5) {
                System.out.println(" Exceptional! You guessed the number in "+ Trials +" tries.. Excellent job!");
            } else if (Trials <= 10) {
                System.out.println("Well done! You successfully guessed the number in "+ Trials +" tries. Nice effort!");
            } else {
                System.out.println("Good effort! You guessed the number, but with "+ Trials +" tries, there's room for improvement..");
            }
        }
        
        if(!CorrectGuess && Trials>maxTrials){
            System.out.println("You have reached maximum attempts!");
            System.out.println("The secret number was " + secretNumber+"\n GAME OVER");
        }
        
        System.out.println("Enter 'y' if you want to play another round");
    }
     
     while(input.next().equalsIgnoreCase("y"));
       
     System.out.println("Thanks for playing !");
     System.out.println("Total Score: "+totalScore);
     input.close();
     
    }
}
    
