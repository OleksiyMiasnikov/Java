package demo;

import java.util.Scanner;

public class Chinese_horoscope {

	public static void main(String[] args) {
		String[] array = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat"};
		
		int age = new Scanner(System.in).nextInt();
		
		System.out.println(array[age%12]);
		
	}

}
