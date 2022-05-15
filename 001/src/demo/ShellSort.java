package demo;

public class ShellSort {

	public static void main(String[] args) {
		//int[] array = {30, 2, 10, 4, 6};
		int[] array = {32, 95, 16, 82, 24, 66, 35, 19, 75, 54, 40, 43, 93, 68, 25};
		int length = array.length;
		
		//PUT YOUR CODE HERE
		int d, k, l, b;
		
		for (d = length / 2; d != 0; d/=2) {
			for (k = d; k < length; k++) {
				for (l = k-d; (l >=0 && array[l] > array[l+d]); l-=d) {
					b = array[l];
					array[l] = array[l+d];
					array[l+d] = b;
				}
			}
		}
		

		//PUT YOUR CODE HERE
	    
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
