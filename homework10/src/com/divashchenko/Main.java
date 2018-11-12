package com.divashchenko;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

	    Person[] array = new Person[100];
	    String[] firstNames = {
	            "Oliver", "Jack", "Harry", "Jacob", "Charlie", "Thomas",
                "Amelia", "Olivia", "Isla", "Emily", "Poppy", "Ava"
	    };
	    String firstName;
	    String[] lastNames = {
	            "Smith", "Jones", "Williams", "Brown", "Taylor", "Davies"
        };
	    String lastName;
	    int age;
	    double weight;
	    int height;

        for (int i = 0; i < array.length; i++) {
            age = random.nextInt(100) + 1;

            if (age < 2) {
                height = random.nextInt(10) + 73;
            } else if (age < 3) {
                height = random.nextInt(12) + 80;
            } else if (age < 4) {
                height = random.nextInt(14) + 89;
            } else if (age < 5) {
                height = random.nextInt(15) + 94;
            } else if (age < 6) {
                height = random.nextInt(16) + 100;
            } else if (age < 7) {
                height = random.nextInt(20) + 105;
            } else if (age < 8) {
                height = random.nextInt(20) + 111;
            } else if (age < 9) {
                height = random.nextInt(21) + 117;
            } else if (age < 10) {
                height = random.nextInt(24) + 127;
            } else if (age < 16) {
                height = random.nextInt(30) + 130;
            } else {
                height = random.nextInt(70) + 140;
            }

            if (age < 1) {
                weight = height - 73 + random.nextInt(10);
            } else if (age < 3) {
                weight = height - 40 + random.nextInt(10);
            } else if (age < 7) {
                weight = height - 60 + random.nextInt(10);
            } else if (age < 15) {
                weight = height - 90 + random.nextInt(15);
            } else {
                weight = height - 100 + random.nextInt(20) - random.nextInt(30);
            }

            firstName = firstNames[random.nextInt(firstNames.length)];
            lastName = lastNames[random.nextInt(lastNames.length)];

            array[i] = new Person(firstName, lastName, age, weight, height);
        }

        showPerson(array);
    }

    private static void showPerson(Person[] array) {
        for (Person anArray : array) {
            System.out.println(anArray.toString());
        }
    }
}
