import java.util.Scanner;

public class TicTacToe
  {
    public static void main(String [] args)
      {
        //variables
        String[][] board = new String [3][3];
        Scanner keyboard = new Scanner(System.in);
        String xo = "X";

        //set board to spaces instead of nullz
        for(int n = 0; n < board.length; n++)
        {
          for(int j = 0; j < board.length; j++)
          {
             board[n][j] = "-";
          }
        }
        //start game


        for(int i = 0; i < 9; i++)
          {
            if (i % 2 == 0)
              xo = "X";
            else
              xo = "O";

          System.out.print("\n'" + xo + "', choose your location: ");
          int turnY = keyboard.nextInt()  ;
          int turnX = keyboard.nextInt()  ;
          turnY = turnY--  ;
          turnX = turnX--  ;

          board[turnX-1][turnY-1] = xo;
          System.out.println();
      for(int n = 0; n < board.length; n++)
      { System.out.print("\t");
        for(int j = 0; j < board.length; j++)
        {
          System.out.print(" " + board[n][j] + " ");
        }
        System.out.println();
    }

          }
      }
  }
