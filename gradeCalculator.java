import java.util.*;
 //Miguel Gomez
 //PROJECT 1 PART 2
 //CISA4305_001_201810
 //This program will create a class that represents a grade distribution for a given course. 
 //Write the methods that will resolve the following tasks.
   // a. Set the number of each of the letter grades A, B, C, D, and F
   // b. Read the number of each of the letter grades A, B, C, D, and F
   // c. Return the total number of grades
   // d. Return the percentage of each letter grade as a whole number between 0 and 100, inclusive
   // e. Draw a bar graph of the grade distribution
   
 //This time the scanner object will be created in the main method. 
 //From the main method the grades will be sent as parameters to the class GradeDistribution to work with them.
public class gradeCalculator {
    public static void main(String[] args){  
      Scanner keyword = new Scanner(System.in);
      GradeDistribution object = new GradeDistribution(); 
      int a, b, c, d, f;
      String name;
      int action;
      System.out.println("What is your name?");
         name = keyword.nextLine();
         System.out.println();
         System.out.println("Please " + name + ".");
         System.out.println("Enter the number of 'A' that you have in your grades.");
         a = keyword.nextInt();
         System.out.println("Enter the number of 'B'");
         b = keyword.nextInt();
         System.out.println("Enter the number of 'C'");
         c = keyword.nextInt();
         System.out.println("Enter the number of 'D'");
         d = keyword.nextInt();
         System.out.println("Enter the number of 'F'");
         f = keyword.nextInt();
         System.out.println();
         
         object.getSet(a, b, c, d, f); //Send Parameters
         
         System.out.println("What would you like to know. (type the number or type 0 to quit)");
         System.out.println("1. Total of grades");
         System.out.println("2. The percentage of each grade");
         System.out.println("3. Analyze the graph");
         System.out.println("4. list your grades");
         action = keyword.nextInt();
         System.out.println();
         if (action==1){
          System.out.println ("Your total number of grades are: " + object.getTotal());
         }
         else if (action==2){
         int grade;
            System.out.println ("Do you want the percentage of:  1. A, 2. B, 3. C, 4. D, 5. F  (Type a number)");
            grade = keyword.nextInt();
            if (grade==1) {
             System.out.println("It is " +object.getPercentage(grade)+ "%");
            }
            if (grade==2) {
             System.out.println("It is " +object.getPercentage(grade)+ "%");
            }
            if (grade==3) {
             System.out.println("It is " +object.getPercentage(grade)+ "%");
            }
            if (grade==4) {
             System.out.println("It is " +object.getPercentage(grade)+ "%");
            }
            if (grade==5) {
             System.out.println("It is " +object.getPercentage(grade)+ "%");
            }
            
         }
         else if (action==3){
         //It is a void method no need to use System.out.print()
         object.getGraph();
         }
         else if (action==4){
          System.out.println (object.getRead());
         }
         else if (action==0){
          System.exit(0); 
         }
         
   }




public static class GradeDistribution { 

   //public class gradeDistribution{  // Constructor
   int A;
   int B;
   int C;
   int D;
   int F;
   int total;
   
   
   public void getSet(int a, int b, int c, int d, int f) { 
       A = a;
       B = b;
       C = c;
       D = d;
       F = f;
   }
   
   public String getRead(){
       return "Grades  A: "+A+"  B: "+B+"  C: "+C+"  D: "+D+"  F: "+F;
   }
   
   public int getTotal(){
      total = A + B + C + D + F;
      return total;
   }
   
   public int getPercentage(int x){
   int percent = 0;
      if (x==1){
      percent = ((A*100)/getTotal());
      }
      if (x==2){
      percent = ((B*100)/getTotal());
      }
      if (x==3){
      percent = ((C*100)/getTotal());
      }
      if (x==4){
      percent = ((D*100)/getTotal());
      }
      if (x==5){
      percent = ((F*100)/getTotal());
      }
      return percent;
   
   }
   
   public void getGraph() {
      
      System.out.print ("A|");
      getAsterix(getPercentage(1));
      System.out.print ("B|");
      getAsterix(getPercentage(2));
      System.out.print ("C|");
      getAsterix(getPercentage(3));
      System.out.print ("D|");
      getAsterix(getPercentage(4));
      System.out.print ("F|");
      getAsterix(getPercentage(5));
      System.out.println("  -----------------------------------------------------");
      System.out.println (" 0    10   20   30   40   50   60   70   80   90   100%");
   }
   
   
   public void getAsterix(int x){
      int value = x;
         for (int y = 0; y < (value/2); y++){
            System.out.print("*");
         }
      System.out.println ();
      } 
   
 }
}
