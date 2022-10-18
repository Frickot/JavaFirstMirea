package ru.mirea.task2;

import java.util.Scanner;

public class Dog {
    int age;
    String nickname;

    public Dog(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public int ageToHuman(int age) {
        return age * 7;
    }

}