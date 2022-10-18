package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    /*Реализуйте простейший класс Shape (Фигура) на языке программирования Java. Добавьте метод toString().
    Создайте класс-тестер для вывода информации об объекте.*/

    String type;
    int side;

    public Task(String type, int side) {
        this.type = type;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Task{" +
                "type='" + type + '\'' +
                ", side=" + side +
                '}';
    }

// Реализуйте простейший класс Ball (Мяч)

    public class Ball {
        String sport;

        public Ball(String sport) {
            this.sport = sport;
        }
    }

    //Реализуйте простейший класс Book (Книга).
    public class Book {
        int page;
        String name;

        public Book(int page, String name) {
            this.page = page;
            this.name = name;
        }
    }
}