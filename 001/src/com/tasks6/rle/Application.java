package com.tasks6.rle;

public class Application {

	public static void main(String[] args) {
				
		if (args.length == 0 || (args.length == 1 && args [0] == null)) {
			System.out.println("");
		} else {
			StringBuffer sb = new StringBuffer(args[0]);
			int j, sbLength = sb.length()-1;
						
			for (int i=0; i < sbLength ; i++) {
				j =1;
				while (sbLength >= i + j && sb.charAt(i) == sb.charAt(i+j) && j < 9) {					
					j++;					
				}
				
				if (j>1) {
					sb.replace(i+1, i+j, String.valueOf(j));
					sbLength = sbLength - j + 2;
					i ++;
				}				
			}
			System.out.println(sb);
		}		
	}
}
