package com.demo.tictactoe;

public class Board {

	ActionFigure [][] board = new ActionFigure [][] {{null, null, null}, {null, null, null}, {null, null, null}};
	
	/* hasMoreSpace() повертатиме true якщо ще залишилося дві
    * вільні клітинки, або false у випадку якщо залишилося менше двох
    * вільних клітинок
    */
	
	public boolean hasMoreSpace() {
		
		int free = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board [i][j] == null) {
					free ++;
				}
			}			
		}
		return (free < 2) ? false : true;
	}
	
	
	/* метод print() виводить стан Поля на екран */
	public void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board [i][j] != null) {
					System.out.print(board[i][j].toString());
				} else {
					System.out.print("_____");
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

}
