package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class InputException {
/*
 *  Example of using exceptions and logging into file \out\logjava%u.log
 */
    private static final Logger logger = Logger.getLogger(InputException.class.getName());

    public static void main(String[] args) {

        try {
            FileInputStream myConfigFile = new FileInputStream("Exceptions\\src\\logging.properties");
            LogManager.getLogManager().readConfiguration(myConfigFile);
            System.out.println("Configuration file was loaded successfully!");
        } catch (IOException eIO) {
            System.out.println("WARNING: Could not open configuration file");
        }

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
                logger.log(Level.WARNING, "Incorrect input. Exception :" + ex);
            }
        } while (!flagInput);
    }
}
