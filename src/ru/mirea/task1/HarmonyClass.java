package ru.mirea.task1.opt3;

public class HarmonyClass {
    public static void main(String[] args) {
        for (double i = 1; i <= 10; i++) {
            double a=(1/i);
            String str = String.format("%.2f", a);
            System.out.print(str + " ");
        }
    }
}