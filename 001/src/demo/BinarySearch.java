package demo;

public class BinarySearch {

	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 45;

		// PUT YOUR CODE HERE
		int i;
		for (i = 0;(i < data.length && data[i] <  numberToFind); i++) {}
		
		if (i < data.length && data[i] ==  numberToFind) System.out.println(i); 
			else System.out.println("-1");
			
			
		// PUT YOUR CODE HERE

	}

}
