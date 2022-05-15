package demo;

public class MatrixPrint {

	public static void main(String[] args) {
		int size=5;
		int c=1;
		String s = "";
		for (int x=0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				if ((x == y) | (x == size-y-1)) s = s + " * ";
				else if (c < 10) s = s + " " + c + " "; else s = s + c + " " ;
				c++;
			}
			System.out.println(s);
			s="";
			}
	}

}
