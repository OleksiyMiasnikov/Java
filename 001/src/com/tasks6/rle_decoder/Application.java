package com.tasks6.rle_decoder;

public class Application {

	public static void main(String[] args) {
		
		boolean errorStr = false;
		
		if (args.length == 0 || (args.length == 1 && args [0] == null)) {
			System.out.println("");
		} else {
			StringBuffer sb = new StringBuffer(args[0]);
			String digitStr = "0123456789";
			int j, f, sbLength = sb.length();
			
			//System.out.println(sb);
			
			if (sbLength == 0) {
				System.out.println("");
			} else if (digitStr.indexOf(sb.charAt(0)) != -1) {
				System.out.println("");
			} else {
				
			
			for (int i=1; i < sbLength ; i++) {	
				if (sb.charAt(i) == sb.charAt(i-1)) {
					errorStr = true;						
					break;
				}
				
				if (digitStr.indexOf(sb.charAt(i)) != -1) {	
					if ((i + 1 != sbLength) && digitStr.indexOf(sb.charAt(i+1)) != -1) {
						errorStr = true;						
						break;
					}
					f = Character.getNumericValue(sb.charAt(i));
					for (j = 1; j < f; j++) {
						sb.insert(i,sb.charAt(i-1));
					}
					if (f == 0) {
						sb.deleteCharAt(i-1);
						sb.deleteCharAt(i-1);
						sbLength -=2;
						i--;
					} else {
						sb.deleteCharAt(i+f-1);
						sbLength += j - 2;
						i += j - 1;
					}					
				}				
			}
			
			
			if (errorStr) {
				System.out.println("");
			} else {
				System.out.println(sb);
			}
			}
		}		

		
		
		
	}

}
