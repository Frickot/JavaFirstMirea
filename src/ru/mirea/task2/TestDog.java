package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {

    public static void addNewDog() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount dog: ");
        int amount = scan.nextInt();

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter nickname: ");
            String nickname = scan.next();

            System.out.println("Enter age: ");
            int age = scan.nextInt();

            Dog newDog = new Dog(age, nickname);
            dogs.add(newDog);

            System.out.println(newDog.toString() + "Age to Human: " + newDog.ageToHuman(age));
            System.out.println("List of dogs: " + dogs.toString());

        }
    }
    public static void main(String[] args) {
        TestDog.addNewDog();
    }
}