import java.util.Scanner;

public class HelloUser {
    //Приветствовать любого пользователя
    // при вводе его имени через командную строку.

    public static void main(String [] args) {
        String name;
        if (args.length == 0) {
            System.out.print("Input your name, please :");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
        } else {
            name = args [0];
        }
        System.out.println("Hello " + name + "! How are you?");
    }
}
