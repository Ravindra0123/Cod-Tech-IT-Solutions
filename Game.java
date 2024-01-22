import java.util.*;
class tictactoe{
static char[][] board;

    public tictactoe()
    {
        board = new char[3][3];
        initBoard();
    }
    void initBoard()
    {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length;j++)
            {
                board[i][j]='_';
            }
        }
    }
   static void display()
    {
        System.out.println("-------------");
         for(int i=0; i<board.length; i++)
        {
            System.out.print("| ");
            for(int j=0; j<board[i].length;j++)
            {
               System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    
    }
    static void placeMark(int row, int col, char mark)
    {
        if(row>=0 && row<=2 && col>=0 && col<=2)
        {
            board[row][col] = mark;
        }
        else
        {
            System.out.println("Invalid Position");
        }
    }
   static boolean checkcolwin()
    {
        for(int j=0;j<=2;j++)
        {
            if(board[0][j] !='_' && board[0][j] == board[1][j] && board[1][j] == board[2][j])
            {
                return true;
            }
        }
        return false;
    }
   static boolean checkrowwin()
    {
    for(int i=0;i<=2;i++)
        {
            if(board[i][0] !='_' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
            {
                return true;
            }
        }
        return false;
    }
   static boolean checkdiagwin()
    {
        if(board[0][0] != '_' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] !='_' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            return true;
        }
        else{
            return false;
        }
    }
   static boolean checkdraw()
   {
       for(int i=0; i<=2; i++)
       {
           for(int j=0; j<=2; j++)
           {
               if(board[i][j] == '_')
               {
                   return false;
               }
           }
       }
    return true;
   }
  
}
class Humanplayer
{
    String name;
    char mark;
    Humanplayer(String name, char mark)
    {
        this.name= name;
        this.mark= mark;
    }
    void makemove()
    {
        Scanner sc = new Scanner(System.in);
         int row;
         int col;
        do
        {
        System.out.println("Enter the row and column");
         row = sc.nextInt();
         col = sc.nextInt();
        }while(!validmove(row, col));
        tictactoe.placeMark(row, col, mark);
    }
    
   boolean validmove(int row, int col)
    {
        if(row>=0 && row<=2 && col>=0 && col<=2)
        {
            if(tictactoe.board[row][col] =='_')
            {
                return true;
            }
        }
        return false;
    }
}









public class Game {
    public static void main(String[] args) {
      tictactoe t = new tictactoe();
    Humanplayer p1 = new Humanplayer("bob",'X');
    Humanplayer p2 = new Humanplayer("aob",'O');
    Humanplayer cp;
    cp=p1;
    while(true)
    {
        System.out.println(cp.name + " Turn");
    cp.makemove();
    tictactoe.display();
    if(tictactoe.checkcolwin() || tictactoe.checkrowwin() || tictactoe.checkdiagwin())
    {
        System.out.println(cp.name + " Has Won");
        break;
    }
    else if(tictactoe.checkdraw())
    {
        System.out.println("Game Is Draw");
        break;
    }
    else
    {
        if(cp == p1)
        {
            cp = p2;
        }
        else
        {
            cp = p1;
        }
    }
    }
    
   }
}
