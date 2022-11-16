package ru.mirea.task7.hfh;

import ru.mirea.task7.hfh.MathFunc;

import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        MathFunc mathfunc = new MathFunc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        System.out.println("Введите степень");
        System.out.printf("Возведение в степень= "+mathfunc.pow(sc.nextDouble(), sc.nextInt()));
        System.out.println("");
        System.out.println("Введите число");
        System.out.println("Введите модуль");
        System.out.printf("Модуль комплексного числа= "+mathfunc.module(sc.nextDouble(), sc.nextDouble()));
        System.out.println("");
        System.out.println("Введите диаметр");
        System.out.printf("Длина окружности= "+mathfunc.CircleLength(sc.nextDouble()));
    }
}