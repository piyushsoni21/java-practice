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
public class NQueenProblems2 {

	int [] leftRow;
	int [] lowerDiagonal;
	int [] upperDiagonal;

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
			if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0
					&& upperDiagonal[board.length - 1 + (col - row)] == 0) {
				board[row][col] = 'Q';
				leftRow[row] = 1;
				lowerDiagonal[row + col] = 1;
				upperDiagonal[(board.length - 1) + (col - row)] = 1;
				helper(board, allBoards, col + 1);
				leftRow[row] = 0;
				lowerDiagonal[row + col] = 0;
				upperDiagonal[(board.length - 1) + (col - row)] = 0;
				board[row][col] = '.';
			}
		}
	}

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
		leftRow = new int[n];
		lowerDiagonal = new int[2 * n - 1];
		upperDiagonal = new int[2 * n - 1];

		helper(board, allBoards, 0);
		if (allBoards.isEmpty()) {
			System.out.println("Could not placed queens ...conflicting");
		} else {
			System.out.println("queens placed");
			System.out.println(allBoards);
		}
		return allBoards;
	}

	public static void main(String[] args) {
		NQueenProblems2 nq = new NQueenProblems2();
		nq.solveNQueens(4);
	}
}
