package ru.mirea.task19;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException() {
        super("Student not found");
    }
}