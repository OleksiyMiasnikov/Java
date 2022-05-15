package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class Application {

	public static double parse(String rpnString) throws RPNParserException, ArithmeticException {
		
		String[] arrayPl = rpnString.split(" ");
		LinkedList<Double> sT = new LinkedList<Double>();
		double a;

		try {
			for (int i = 0; i < arrayPl.length; i++) {
				switch (arrayPl[i]) {
				case ("+"):
					sT.push(sT.pop() + sT.pop());
					break;
				case ("-"):
					a = sT.pop();
					sT.push(sT.pop() - a);
					break;
				case ("*"):
					sT.push(sT.pop() * sT.pop());
					break;
				case ("/"):
					a = sT.pop();
					if (a == 0) {
						throw new ArithmeticException();
					}
					sT.push(sT.pop() / a);
					break;
				default:
					try {
						sT.push(Double.parseDouble(arrayPl[i])); 
					} catch (Exception e) { 
						throw new RPNParserException(); 
					}					 
				}
			}

		} catch (ArithmeticException e) {
			throw e;
		} catch (Exception e) {			
			throw new RPNParserException();			
		}
		return sT.pop();

	}

	public static void main(String[] args) {

		//System.out.println(parse("0 0 /"));
	}

}
