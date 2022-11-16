package ru.mirea.task7.hfg;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        String testString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Строка =");
        StringFunc sf = new StringFunc();
        testString = sc.nextLine();
        System.out.println("Длина " + sf.length(testString));
        System.out.println("Перевернутая строка " + sf.revers(testString));
        System.out.println("Строка состоящая из символов на нечетных позициях =" + sf.oddString(testString));
    }
}