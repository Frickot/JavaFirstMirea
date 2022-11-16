package ru.mirea.task7.hfh;

import ru.mirea.task7.hfh.MathCalculable;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double number, int not) {
        return Math.pow(number, not);
    }

    @Override
    public double module(double re, double im) {
        return Math.sqrt((pow(re,2)+pow(im, 2)));
    }

    public double CircleLength(double r) {
        return 2*pi*r;
    }
}