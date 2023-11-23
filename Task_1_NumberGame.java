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

          

       
     


    }
 }