package Samples;

import java.util.HashMap;
import java.util.Scanner;

public class B003_HashMapSample {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("Ukraine", "Kyiv");
        countries.put("Poland", "Warszava");
        countries.put("Great Britain", "London");
        countries.put("Japan", "Tokyo");

        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Input name of country from list (" + countries.keySet() + ") :");
            name = scanner.nextLine();
        } while (!countries.containsKey(name));

        System.out.println(countries.get(name));
    }
}
