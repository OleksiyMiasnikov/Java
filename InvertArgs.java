
import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class InvertArgs {
    //Отобразить в окне консоли аргументы командной строки в обратном порядке.

    public static void main(String @NotNull [] args) {
        if (args.length == 0) {
            System.out.println("There is no arguments!!!");
            return;
        }
        Stack<String> stackArgs = new Stack<>();
        for (String elem: args) {
            stackArgs.push(elem);
        }
        while (!stackArgs.empty()){
            System.out.println(stackArgs.pop());
        }

    }
}
