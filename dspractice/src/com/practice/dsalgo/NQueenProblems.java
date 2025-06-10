/**
 * 
 */
package com.dsalgo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Piyush Soni
 *
 */
public class NQueenProblems {
	public boolean isSafe(int row, int col, char[][] board) {
		
		int dupRow = row;
		int dupCol = col;
		
		//check diagonal upper left
		while(row >=0 && col >=0) {
			if(board[row][col] == 'Q') {
				return false;
			}
			row --;
			col--;
		}
		
		
		 row = dupRow;
		 col = dupCol ;
		//check horizontal left
		while(col >=0) {
			if(board[row][col] == 'Q') {
				return false;
			}
			col--;
		}
		
		row = dupRow;
		col = dupCol ;
		// check lower left
		while(row<board.length && col >=0)  {
			if(board[row][col] == 'Q') {
				return false;
			}
			row++;
			col--;
		}

		
		return true;
	}

	public void saveBoard(char[][] board, List<List<String>> allBoards) {
		String row = "";
		List<String> newBoard = new ArrayList<>();

		for (int i = 0; i < board.length; i++) {
			row = "";
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'Q')
					row += 'Q';
				else
					row += '.';
			}
			newBoard.add(row);
		}

		allBoards.add(newBoard);
	}

	public void helper(char[][] board, List<List<String>> allBoards, int col) {
		if (col == board.length) {
			saveBoard(board, allBoards);
			return;
		}

		for (int row = 0; row < board.length; row++) {
			if (isSafe(row, col, board)) {
				board[row][col] = 'Q';
				helper(board, allBoards, col + 1);
				board[row][col] = '.';
			}
		}
	}

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];

		helper(board, allBoards, 0);
		if(allBoards.isEmpty()) {
			System.out.println("Could not placed queens ...conflicting");
		}else {
			System.out.println("queens placed");
			System.out.println(allBoards);
		}
		return allBoards;
	}

	
	public static void main(String[] args) {
		NQueenProblems nq = new  NQueenProblems();
		nq.solveNQueens(4);
	}
}
