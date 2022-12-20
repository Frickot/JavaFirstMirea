package ru.mirea.task22;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("Stack is empty");
    }
}