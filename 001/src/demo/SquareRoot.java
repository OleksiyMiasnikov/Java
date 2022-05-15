package demo;

public class SquareRoot {

	public static void main(String[] args) {
		double a = 3;
        double b = 2.5;
        double c = -0.5;

		double d, x1, x2;
				
		d = b*b - 4*a*c;
		if (d >= 0) {
			{if (a==0) {
				if (b==0) {
					System.out.println("x1=");
					System.out.println("x2=");
					return;
					}
				x1=x2=(-c/b);
				if (x1==-0.0) {x1=x2=0;}
				}
			else {
				x1 = (Math.sqrt(d)-b) / (2*a);
				x2 = (-Math.sqrt(d)-b) / (2*a);
			}
			}
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
					} else {
						System.out.println("x1=");
						System.out.println("x2=");
					}

	}

}
