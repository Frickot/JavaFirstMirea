package ru.mirea.task7.hfdd;

public class TestMovable1 {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1,3, 9, 10, 0, 0);
        System.out.println(rectangle.convertToString(12,12));
        System.out.println("скорость");
        rectangle.speedTest();
    }
}