package com.divashchenko;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double weightKg;
    private int heightCm;

    //=================================================

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age, double weightKg, int heightCm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
    }

    //=================================================

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    //=================================================


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weightKg=" + weightKg +
                ", heightCm=" + heightCm +
                '}';
    }
}
