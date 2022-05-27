package Samples;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("apple");
        food.add("bread");
        food.add("cheese");
        food.add("burger");
        food.add("pizza");


        for (String element : food) {
            System.out.println(element);
        }

        food.remove(4);
        food.set(2,"sausages");

        System.out.println();

        for (String element : food){
            System.out.println(element);
        }
    }

 }
