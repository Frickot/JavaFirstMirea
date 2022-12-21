package ru.mirea.task22;

import java.util.Arrays;

public class MinMax <T>{

    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
        Arrays.sort(arr);
    }

    public void SortMax ()
    {
        System.out.println("Максимальный элемент массива: " + arr[arr.length-1]);
    }

    public void SortMin()
    {
        System.out.println("Минимальный элемент массива: " +arr[0]);
    }
}