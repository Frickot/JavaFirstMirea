package ru.mirea.task1.opt3;
import java.util.Random;
public class ClassicRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int a;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            a = r.nextInt(70) + 10;
            arr[i] = a;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp;
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}