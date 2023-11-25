import java.util.*;
                     
public class Task_2_GradeCal {

    public static void main(String [] args){

    //introdunction.
System.out.println(" -Student Grade Calculator- ");
        
//code to input marks of 5 subjects.
System.out.println("Enter the Marks obtained in the respective 5 subjects");
System.out.println("                     *****                           ");

Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks Obtained out of 100 in Maths : ");
int marksMaths = sc.nextInt();

System.out.println("Enter the marks Obtained out of 100 in Physics: ");
int marksPhy = sc.nextInt();

System.out.println("Enter the marks Obtained out of 100 in Chemistry : ");
int marksChem = sc.nextInt();

System.out.println("Enter the marks Obtained out of 100 in Hindi : ");
int marksHindi = sc.nextInt();

System.out.println("Enter the marks Obtained out of 100 in English : ");
int marksEng = sc.nextInt();

//code for average percentage.
int averagePer ;
averagePer= (marksChem+marksEng+marksHindi+marksMaths+marksPhy)/5;

int totalMarks=marksChem+marksEng+marksHindi+marksMaths+marksPhy;

//code for grade assignment.
if(averagePer>=90){
    System.out.println("Your Total Marks are :" +totalMarks );
    System.out.println(" You are having 'A+' Grades with the Average Percentage of :" +averagePer );
}
else if(averagePer < 90 && averagePer >= 80){
    System.out.println("Your Total Marks are :" +totalMarks );
    System.out.println("You are having 'A' Grades with the Average Percentage of :" +averagePer );
}
else if(averagePer < 80 && averagePer >= 70){
    System.out.println("Your Total Marks are :" +totalMarks );
    System.out.println("You are having 'B+' Grades with the Average Percentage of :" +averagePer );
}
else if(averagePer < 70 && averagePer >= 60){
    System.out.println("Your Total Marks are :" +totalMarks );
    System.out.println("You are having 'B' Grades with the Average Percentage of :" +averagePer );
}
else if(averagePer < 60 && averagePer >= 50){
    System.out.println("Your Total Marks are :" +totalMarks );
    System.out.println("You are having 'C' Grades with the Average Percentage of :" +averagePer );
}
else if(averagePer < 50 && averagePer >= 40){
    System.out.println("Your Total Marks are :" +totalMarks );
    System.out.println("You are having 'D' Grades with the Average Percentage of :" +averagePer );
}
else if (averagePer < 40 && averagePer >= 30){
    System.out.println("Your Total Marks are :" +totalMarks );
    System.out.println("You are having 'E' Grades with the Average Percentage of :" +averagePer );
}
 else if (averagePer < 30){
   System.out.println("Your Total Marks are :" +totalMarks );
   System.out.println("You are 'Fail!' with the Average Percentage of :" +averagePer );
 }



    }
}


  

