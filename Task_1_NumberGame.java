 import java.util.*;

 class Task_1_NumberGame{

   public static void main(String[] args){
     
    int number;
    int round=3;
    int guess=1;
    int attempts=10;
    int score=0;
     
    //Game Introduction

    System.out.println("Welcome to the Number Guessing Game");
    System.out.println("There will be 3 Rounds and each Round will have 10 Attempts");
    System.out.println("All The Best!");
    System.out.println("Let's Start!");


    //loop for rounds
    for(int i=1; i<=round;i++){

      //Code to generate Random numbers(1-100)
       Random randomNumber = new Random();
       number = randomNumber.nextInt(100);
       number+=1;

       System.out.println("Round  " +i);
       System.out.println("Guess The Generated Number!");

       //loop for attempts
       for(int j=1;j<=attempts;j++){
             
        //code to input the guessed numbers
        Scanner sc = new Scanner(System.in);
        guess = sc.nextInt();

 
        if(guess > number){
        System.out.println("Too High! :(");
        }

        else if  (guess < number){
        System.out.println("Too Low! :(");
        }
        
        else if (guess == number){
         System.out.println("Correct!!! :)");
         score+=1;
         break;
         }

         else{
         System.out.println("oh!... You Loose the Game!:(");
         }
           
         } 

         }

         System.out.println("");
         System.out.println("Game Over!");
         System.out.println("Youre Total Score out of 3 is: " +score);

         if(score==3){
         System.out.println("Hurreyyy!! You Won the Game.");
         }

 }
}


       
     


    