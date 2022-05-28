package Samples;

import java.util.Scanner;

class LenNumber {
    int number;

    public LenNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int len(){
        int number = this.number;
        int res = 0;
        while (number != 0) {
            number /= 10;
            res += 1;
        }
        return res;
    }

    public int len(int number){
        int res = 0;
        while (number != 0) {
            number /= 10;
            res += 1;
        }
        return res;
    }
    public int compare (int comparable) {
        int ln = len();
        int lc = len(comparable);
        return (ln < lc) ? -1 : ((ln == lc) ? 0 : 1);
    }

    public String toString () {
        return "Length of " + number + " is " + len() + ".";
    }
}

public class B004_LenNumberClass {

    public static void main(String[] args) {
        int number = 15567;
        LenNumber lNumber = new LenNumber(number);
        System.out.println(lNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number, please :");
        int newNumber = scanner.nextInt();
        int res = lNumber.compare(newNumber);
        if (res == 1){
            System.out.println("My number is longer than yours!");
        } else if (res == -1){
            System.out.println("Your number is longer than mine!");
        } else {
            System.out.println("Our numbers are the same length!");
        }
    }
}
