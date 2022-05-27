package Samples;

import java.util.ArrayList;

public class B002_ArrayListSample {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();
        food.add("apple");
        food.add("bread");
        food.add("cheese");
        food.add("burger");
        food.add("pizza");

        System.out.println(food);

        food.remove(4);
        food.set(2,"sausages");

        System.out.println(food);

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("juice");
        drinks.add("coffee");
        drinks.add("beer");

        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>();
        shoppingList.add(food);
        shoppingList.add(drinks);

        System.out.println("Shopping list :" + shoppingList);
    }

 }
