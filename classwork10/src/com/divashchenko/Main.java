package com.divashchenko;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 0.146, 10.49);
        System.out.println("redApple: " + redApple);

        Fruit greenApple = new Fruit(FruitType.APPLE, Color.GREEN, 0.246, 11.99);
        System.out.println("greenApple: " + greenApple);

        Fruit lemon = new Fruit(FruitType.LEMON, Color.YELLOW, 0.124, 31.99);
        System.out.println("lemon: " + lemon);

        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 0.152, 18.99);
        System.out.println("banana: " + banana);

        Fruit[] arr = new Fruit[4];
        arr[0] = redApple;
        arr[1] = greenApple;
        arr[2] = lemon;
        arr[3] = banana;

        System.out.println();

        printPrice(arr);
    }

    private static void printPrice(Fruit[] arr) {
        double price = 0;
        for (int i = 0; i < arr.length; i++) {
            price += arr[i].price();
        }
        String formattedDouble = new DecimalFormat("#0.00").format(price);
        System.out.println("Price is: " + formattedDouble);
    }
}