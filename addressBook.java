import java.util.*;
//Miguel Gomez
//PROJECT 3 PART 1
//Entry into Adrress Book:|first name|last name of the person|e-mail address|telephone number.
//It will have methods to:
//Access each attribute|Change the e-mail address|Change the telephone number|Test whether two instances are equal based solely on name.

 public class addressBook{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
      PersonAddress object = new PersonAddress();
      
   
      object.PersonAddress();
      
      object.retAB();
      String [][] AddressBook = object.saveAB();
      System.out.println();
      System.out.println();
      System.out.println("Your Address Book has been saved, to modified the Address Book type the number of the entry. Or just type 0 to quit");
      int entry = input.nextInt();
      if (entry != 0){
         object.editAB(entry);
      }
   }
   
   
 public static class PersonAddress{
  Scanner keyword = new Scanner(System.in);
  String[][] AddBook;
  
   public void PersonAddress(){
      String fName;
      String lName;
      String email;
      String tNumber;
      int key;
      int numCont;
      int x = 0;
   
      System.out.println("Opening Address Book");
      System.out.println("How many contacts will you save");
      numCont = keyword.nextInt();
      keyword.nextLine();  //  will consume next line left over, which made my first and last name entries request to be diplayed together.
      AddBook = new String[numCont][4];
      
      while (numCont != 0){
         System.out.println ("Save Contact in the Address Book");
         System.out.println ();
         
         System.out.println ("First Name");
         fName = keyword.nextLine();
         
         System.out.println ("Last Name");
         lName = keyword.nextLine();
         
         System.out.println ("Email");
         email = keyword.nextLine();
         
         System.out.println ("Telephone Number");
         tNumber = keyword.nextLine();
         
         numCont = numCont - 1;
         AddBook[x] = new String[] {fName, lName, email, tNumber};
         x = x + 1;
     }
     
    }
   
   public void retAB(){    // This method will displayed the Address Book.
      System.out.println();
      System.out.println("Address Book");
      System.out.println();
      System.out.println("  Name           Email                Telephone");
      for(int i=0; i<AddBook.length; i++) {
        System.out.print((i + 1)+ " ");
        for(int j=0; j<AddBook[i].length; j++) {
         System.out.print(AddBook[i][j] + "  ");
        }
        System.out.println();
      }
   }
   
   public String[][]saveAB(){ // Method called from the main method that will assign to a array the data enter by the user.
      return AddBook;
   }
   
   public void editAB(int en){      // This method will decide if email or telephone are chosen to be changed.
      System.out.println("To change email(Press 1). To change telephone (press 2)");
      int choice = keyword.nextInt();
      keyword.nextLine();
      
      if (choice == 1){
         System.out.println("Type new Email");
         String newEm = keyword.nextLine();
         changeEmail(en, newEm);
      
      }
      else if (choice == 2){
         System.out.println("Type new Telephone");
         String newTel = keyword.nextLine();
         changeTelephone(en, newTel);
      
      }
      
      retAB();
      
   }
   
   // The next two methods will modified the email or telephone from the address book.
   public void changeEmail(int entry, String change){
      AddBook[entry - 1][2] = change;
   
   }
   
   public void changeTelephone(int entry, String change){
      AddBook[entry - 1][3] = change;
   }
 } 
}