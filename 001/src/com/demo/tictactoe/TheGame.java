package com.demo.tictactoe;

public class TheGame {

	public static void main(String[] args) {
		Referee referee = new Referee();
		/*
         * ��� ��������� ������ � ���� ����������� ���� �������� ��� ��������
         * ���� �� ���� ��������������� �� ���: ������� ��� �����
         */  	
		Player player1 = new Player(ActionFigure.NOUGHT);
		Player player2 = new Player(ActionFigure.CROSS);

		Board board = new Board(); 

		
		 /*
         * ���� ���� ������ ����� hasMoreSpace(), �� ����������� true ���� �� ���������� ��
         * ����� �������, ��� false � ������� ���� ���������� ����� ����
         * ������ �������
         */
		
		while (board.hasMoreSpace()) {
			/*
             * ����� �������, ������� ���, ������� ��������� �� �� �������
             * �������� �������. ��� ������ ������� ��������� �� ��� ���������.
             *
             * � ����� ����������� �������� �� ������ ���������� ��� ����� �����,
             * ��� ����� �������� �� ������������ ����.
             * ������ � ������ �� ������ �� ���� ������ ����������� � ����� ��������� ������.
             *
             */
			
			Move move = player1.turn(board);
			 /*
             * �������������� �� ��������� �������� �� ��� ���� �����
             * ³� �� �������� ������������ ����, ������ ������ ������� �� ���
             */
			referee.put(move, board); 
			 /* ����� print() �������� ���� ���� �� ����� */
			board.print(); 
			/*
             * ����� isWin ��������� �� ��� ��� ���������, ���� ��� �� ��
             * ������� true
             */
			if (referee.isWin(move, board)) { 
				/*
                 * ���� ��� ��� ��������� �� ������� ��������� ���.
                 * �������� �� ���������� ��� ���� ����������� ��������� ����� ���
                 */
				break;
			} 
			
			  /*
             * ��� ��� 䳿 ������� �������� ��� ������� ������
             */
            /*
             * � ����� ����������� �������� �������� ������ ����������� ���
             * ����� �� ������� ���, �� ������������ � ������� �����
             */
			move = player2.turn(board);
			referee.put(move, board);
			board.print();
			if (referee.isWin(move, board)) {
				break;
			}
		}
	}

}
