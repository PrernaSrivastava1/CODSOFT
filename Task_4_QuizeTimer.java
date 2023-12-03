import java.util.*;

public class Task_4_QuizeTimer{
private static final Scanner sc = null;

    static int seconds = 0;
    static Timer timer = new Timer();
    static int number = 1;
    static int count = 0;
 


public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    TimerTask task = new TimerTask() {
      public void run() {
          seconds++;
      }
  };
  timer.schedule(task, 1000, 1000);


    //intro
    System.out.println("             Welcome to the Quize!               ");
    System.out.println("Rules  : ");
    System.out.println("       There will be 5 Multiple choice questions.");
    System.out.println("       Each question will have four Options");
    System.out.println("       There will be limited time!");
    System.out.println("       You have 20 seconds to answer each question.");
    System.out.println("        If no answer is selected, it will count as 0");
    System.out.println("    All The Best! , Let's Start!   ");




    while (number <= 5) {
      System.out.println("Question " + number + ":");
    //Questions.
    System.out.println("Q.A : Who was the first President of India?");
    System.out.println("");
    System.out.println(" 1. : Lal Badur Stastri Ji.   ");
    System.out.println(" 2. : Dr. Rajendra Prasad.   ");
    System.out.println(" 3. : Jwaharlal Nehru.   ");
    System.out.println(" 4. :  Mahatama Gandhi Ji.   ");

    int ans;
    ans = sc.nextInt();
    if (seconds <= 20) {
    if(ans==2){
      System.out.println("Correct!");
      count++;
    }
    else{
      System.out.println("Wrong!");
    }
    }else {
      System.out.println("Time's up!");
  }
    System.out.println("");
    
  
    System.out.println("Q.B : Formula Of Water?");
    System.out.println("");
    System.out.println(" 1. : H2O.   ");
    System.out.println(" 2. : OH.   ");
    System.out.println(" 3. : D2O.   ");
    System.out.println(" 4. : NO2.   ");

   ans = sc.nextInt();
    if (seconds <= 20) {
    if(ans==1){
      System.out.println("Correct!");
      count++;
    }
    else{
      System.out.println("Wrong!");
    }
    }else {
      System.out.println("Time's up!");
  }
System.out.println("");
    


    System.out.println("Q.C : Full form of IAS?");
    System.out.println("");
    System.out.println(" 1. : Indian Air Service.   ");
    System.out.println(" 2. : Indian Administrative Serivce.   ");
    System.out.println(" 3. : In All Sector.   ");
    System.out.println(" 4. : Indian Army Service .   ");

ans = sc.nextInt();
    if (seconds <= 20) {
    if(ans==2){
      System.out.println("Correct!");
      count++;
    }
    else{
      System.out.println("Wrong!");
    }
    }else {
      System.out.println("Time's up!");
  }
System.out.println("");


    System.out.println("Q.D : Who is the Father of Computer ?");
    System.out.println("");
    System.out.println(" 1. : Charles Babage.   ");
    System.out.println(" 2. : CV Raman.   ");
    System.out.println(" 3. : Newton.   ");
    System.out.println(" 4. : Ramanujan.   ");

ans = sc.nextInt();
    if (seconds <= 20) {
    if(ans==1){
      System.out.println("Correct!");
      count++;
    }
    else{
      System.out.println("Wrong!");
    }
    }else {
      System.out.println("Time's up!");
  }
System.out.println("");


    System.out.println("Q.E : Full form of DTH?");
    System.out.println("");
    System.out.println(" 1. : Direct to Home.   ");
    System.out.println(" 2. : Daily to House.   ");
    System.out.println(" 3. : Dedicated to Here.   ");
    System.out.println(" 4. : Delete the Hundered.   ");


  ans = sc.nextInt();
    if (seconds <= 20) {
    if(ans==1){
      System.out.println("Correct!");
      count++;
    }
    else{
      System.out.println("Wrong!");
    }
    }else {
      System.out.println("Time's up!");
  }
System.out.println("");


  System.out.println("Total Score : " +count);

  }

    


}
}




    
    
   

  


