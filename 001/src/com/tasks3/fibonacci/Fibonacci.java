package com.tasks3.fibonacci;

public class Fibonacci {
	//������� ����� Գ������� �� �������, ��������� ��������� � �������
    //���� ����� �� ������� ���������� �������� -1
	
	public long getNumber(int position){
		//PUT YOUR CODE HERE
		long result;
		if (position < 1) {
			result = -1;
		} else if (position == 1) {
			result = 1;
		} else if (position == 2) {
			result = 1;
		} else {
			result = getNumber(position-1) + getNumber(position-2);
		}
		return result;
				
		//PUT YOUR CODE HERE
	
    }
}
