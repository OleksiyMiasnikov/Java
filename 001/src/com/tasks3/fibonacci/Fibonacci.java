package com.tasks3.fibonacci;

public class Fibonacci {
	//Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
    //якщо число не можливо вирахувати поверніть -1
	
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
