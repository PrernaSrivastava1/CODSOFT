import java.util.*;

public class Task_3_ATM_interface {

       //method for Balance Inquiry.
       static void BalanceInquiry(){

              //let us assume balance = 100000 for now.
              int balance=100000;
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the PIN");
              int atmpin  = sc.nextInt();
              System.out.println("Your Total Balance is : " +balance);
              System.out.println("Thank You!");
       }
      
   
     //method for deposit.
     static int Deposit(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Amount to be Deposited");
       int amount = sc.nextInt();

       System.out.println("Enter the PIN");
       int atmpin = sc.nextInt();

       System.out.println("Put the Cash");
       System.out.println("   ......   ");
       System.out.println("Confirm Your Decision!");
       System.out.println("1. Deposit");
       System.out.println("2. Cancel");
       
       int choice = sc.nextInt();
       switch (choice) {
              case 1: System.out.println("Congrats!! Money Diposited Successfully!");
                      int balance = 100000;
                      balance= balance + amount;
                      System.out.println("Your total Balance is :" +balance);
                      break;
              case 2: System.out.println("You Cancelled Your Transaction!");
                     break;
       }

       System.out.println("Thank You!");
       return 0;

     }  
   

    //method for withdrawal.
    static int Withdrawl(){
         
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Amount for Withdrawl:");
            int amount = sc.nextInt();

            System.out.println("Enter the PIN");
            int atmpin = sc.nextInt();
             
            // let us take balance = 100000.
            int balance=100000;
            if(amount>balance){
            System.out.println("Insufficient Balance!");
            
            }
            else if(amount<balance){
            balance = balance - amount;
            System.out.println("Your Cleared Balance is :" +balance);
            System.out.println("Please Take Your Money!");
            System.out.println("Thank You!");
            
            }
            return balance;
    }




    public static void main(String[] args){
    
       
        System.out.println("         Welcome!         ");
        System.out.println("**Available Transactions Options **");
        System.out.println("Select Your Transactions: ");
        System.out.println(" 1. Withdrawl");
        System.out.println(" 2. Deposit");
        System.out.println(" 3. Balance Inquiry");
        System.out.println(" 4. Cancel");
       

        Scanner sc = new Scanner (System.in);
        int choice = sc.nextInt();
            
        switch (choice) {
               case 1: System.out.println("You choosed Withdrawal, Let's Proceed!");
                       Withdrawl();
                       break;
               case 2: System.out.println("You choosed Deposit, Let's Proceed!");
                       Deposit();
                       break;
               case 3: System.out.println("You choosed Balance Inquiry, Let's  Proceed!");
                       BalanceInquiry();
                       break;
               case 4: System.out.println("You choosed Cancel!!,Program Closed!");
                       System.out.println("Thank You For Visiting!");
                       break;       
            }
    } 
}
