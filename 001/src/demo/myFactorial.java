package demo;

public class myFactorial {
	
	static int mF (int a, int b) {
		return (b == 1) ? a : mF(a, b-1)*a;
	}

	public static void main(String[] args) {
		System.out.println(mF(2,16));

	}

}
