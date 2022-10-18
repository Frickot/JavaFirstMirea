package ru.mirea.task4;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author oleg = new Author("Oleg", "oleg@gmail.com", 'M');
        System.out.println(oleg);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter new email: ");
        String email = scan.nextLine();
        System.out.println(oleg);

    }
}