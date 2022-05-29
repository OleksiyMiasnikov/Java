package Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
/*
 *  Example of using InputMismatchException
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int val;
        boolean flagInput;

        do {
            try {
                System.out.print("Input integer number, please :");
                val = scanner.nextInt();
                System.out.println(val);
                flagInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect input. You should input integer number!");
                flagInput = false;
                scanner.nextLine();
            }
        } while (!flagInput);
    }
}
