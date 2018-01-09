import java.util.*;
//Miguel Gomez
//PROJECT 3 PART 2
// Tic Tac Toe Game.

public class TTToe{
   public static void main(String[]args){
   
      TicTacToe object = new TicTacToe();
      
      object.TicTacToe();     // Call the objec class and iniciates the game.
   }
   
   
   public static class TicTacToe{
      char [][] board = new char [3][3];     // I  had to declare the array out of the getBoard method and enclose the assignements in curly braces. 
      {
         board[0][0] = '-';
         board[0][1] = '-';
         board[0][2] = '-';
         board[1][0] = '-';
         board[1][1] = '-';
         board[1][2] = '-';
         board[2][0] = '-';
         board[2][1] = '-';
         board[2][2] = '-';
         }
      Scanner keyword = new Scanner(System.in);
   
      public void TicTacToe(){
       
         System.out.println("This is the game TicTacToe.");
         System.out.println("The game is over a board with three rows and three columns.");
         System.out.println("The board as nine slots which are referenced by the number of the row and the column.");
         System.out.println("To play you will chose ether 'X' or 'O'.");
         System.out.println("Then you will insert your character into one of the slots by typing the coordenates.");
         System.out.println("One by one you and your oponent will insert your characters.");
         System.out.println("To win you need to line up your choosen character in a horizontal, vertical, or diagonal line.");
         System.out.println("This is the board.");
         System.out.println();
         getBoard(1, 1, "a");
         System.out.println("Let's Play (Type yes)");
         String start = keyword.nextLine();
         int fullBoard = 0;
         while (start.equals("yes")){     // This loop will run the game
            makeMove();
            if (fullBoard == 14){         // This condition will stop the loop if most of the slots in the board have been filled and there is not a winner yer.
               gameOver();
            }
            fullBoard = fullBoard + 1;
          }
      }
      
      public void getBoard(int r, int c, String a){      // Method to display the board using nested for loops.It will thake the coordenates and assign ether x or o to that spot on the board.
          
          if (a == "x"){
            board[r-1][c-1] = 'X';
          }
          else if (a == "o"){
            board[r-1][c-1] = 'O';
          }
       
          int x = 1;
          System.out.println("    1       2       3      ");
          for (int i = 0; i < board.length; i++){
            System.out.println("        |       |       ");
            for (int j = 0; j < board[i].length; j++){
               System.out.print("    " + board[i][j] + "   ");
            }
            System.out.println();
            System.out.println(x +"------------------------");
            x = x + 1;
          } 
          checkWinner();   // Check if someone has won.
        
      }
      
      public void winner(){      //Display a string whe someone has won the game by aligning verticaly, horizontaly, or in a diagonal line three same elements.
         System.out.println();
         System.out.println("You are the winner.!!!CONGRATULATIONS!!!.");
         System.exit(1);         // Close the game
      }
      
      public void makeMove(){    // Ask for a chosen symbol to play|ask for the row and column in which to assign the symbol|call getBoard method sending the parameters.
         System.out.println("Player choose x or o.");
         String chose = keyword.nextLine();
         int row;
         int column;
         if (chose.equals("x")){
            System.out.println("Type coordenates for first move.");
            System.out.println("Type row.");
            row = keyword.nextInt();
            System.out.println("Type column.");
            column = keyword.nextInt();
            getBoard(row, column, "x");
         }
         else if (chose.equals("o")){
            System.out.println("Type coordenates for first move.");
            System.out.println("Type row.");
            row = keyword.nextInt();
            System.out.println("Type column.");
            column = keyword.nextInt();
            getBoard(row, column, "o");
         }
      }
      
      public void checkWinner(){    // Check if there is a winner through if condition statements.
         
         if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')||(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')||(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')){
            winner();
          }
          else if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')||(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')||(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')){
            winner();
          }
          else if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')||(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')){
            winner();
          }
          else if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')||(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')||(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')){
            winner();
          }
          else if ((board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')||(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')||(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')){
            winner();
          }
          else if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')||(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')){
            winner();
          }
        
      }
      
      public void gameOver(){  // Close the game.
         System.out.println("No more moves left. No one wins.");
         System.exit(1);
      }
   }
}