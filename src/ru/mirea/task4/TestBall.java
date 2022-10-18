package ru.mirea.task4;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball newBall = new Ball(8.5, 3.0);
        System.out.println(newBall);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x: ");
        Double x = scan.nextDouble();
        System.out.print("Enter y: ");
        Double y = scan.nextDouble();
        newBall.setXY(x, y);
        System.out.println(newBall);
    }

}