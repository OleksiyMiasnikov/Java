package Samples;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

    public static void main(String[] args) {
        int qN;

        do {
            System.out.print("Input quantity of numbers, please (1 - 10):");
            Scanner scanner = new Scanner(System.in);
            qN = scanner.nextInt();
        } while (qN < 1 || qN > 10);

        Random random = new Random();
        for (int i = 1; i <= qN; i++) {
            System.out.println(random.nextInt());
        }

    }
}
