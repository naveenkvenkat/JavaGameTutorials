package ticTacToe;

public class TicTacToe 
{
	
	public static void main(String[] args)
	{
		String[][] s={{"X","X","X"},{"X","X","X"},{"X","X","X"}};
		showBoard(s);
	}
	
	public static void showBoard(String[][] board)
	{
		for(int i=0; i<board.length-1; i++)
		{
			for(int j=0; j<board[i].length-1; j++)
			{
				System.out.print(board[i][j]+"|");
			}
			System.out.println(board[i][board[i].length-1]);
			for(int k=0; k<board[i].length-1; k++)
			{
				System.out.print("--");
			}
			System.out.println("--");
		}
		for(int j=0; j<board[board.length-1].length-1; j++)
		{
			System.out.print(board[board.length-1][j]+"|");
		}
		System.out.println(board[board.length-1][board[board.length-1].length-1]);
	}
}
