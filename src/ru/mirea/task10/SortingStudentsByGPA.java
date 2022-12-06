package ru.mirea.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

import java.util.Scanner;

public class SortingStudentsByGPA {
    private Student1[] students = new Student1[10];
    SortingStudentsByGPA() {
        students[0]=new Student1("Григорий","Гиркин","Военный","ИВБО-13-21", 1, 1.7);
        students[1]=new Student1("Вадим","Кабанов","Студент", "ИВБО-01-22", 1, 0.5);
        students[2]=new Student1("Иван","Мейлен","киберкуколд","ИВБО-01-21", 2, 1.0);
        students[3]=new Student1("Олег","Ивушкин","Танкист","ИВБО-08-21", 3, 1.9);
        students[4]=new Student1("Игорь","Петров","Физик","ИВБО-08-21", 2, 1.1);
        students[5]=new Student1("Дональд","Трамп","Политик","ИКБО-04-22", 4, 0.1);
        students[6]=new Student1("Барак","Обама","Политик","ИВБО-08-23", 1, 2);
        students[7]=new Student1("Иосиф","Сталин","Генсек","ИНБО-08-21", 3, 1.3);
        students[8]=new Student1("Владимир","Путин","Политик","ББСО-08-21", 2, 1.4);
        students[9]=new Student1("Джо","Байден","Политик","ИКБО-08-21", 4, 1.85);
    }

    public void setArray(Student1[] students) {
        this.students = students;
    }
    public void outArray() {
        for (Student1 st : students) {
            System.out.println("Student{" +
                    "name='" + st.getName() + '\'' +
                    ", surname='" + st.getSurname() + '\'' +
                    ", specialty='" + st.getSpecialty() + '\'' +
                    ", group='" + st.getGroup() + '\'' +
                    ", course=" + st.getCourse() +
                    ", GPA=" + st.getGPA() +
                    '}');
        }
    }

    public Student1[] getStudents() {
        return students;
    }
    public Student1[] Choose () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose another param");
        Options opt = Options.valueOf(scanner.nextLine());
        return Merge.sortArray(students, opt);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA arr = new SortingStudentsByGPA();
        //arr.setArray();
        Student1[] mArray = Merge.sortArray(arr.getStudents(), Options.GPA);
        QuickSort.Sorting(arr.getStudents(),0,arr.getStudents().length-1);

        System.out.println("Merge sort: ");
        for (Student1 st: mArray) {
            System.out.println(st);
        }

        System.out.println("Quick sort:");
        arr.outArray();

        Student1[] mArray1 = arr.Choose();
        System.out.println("By choice:");
        for (Student1 st: mArray1) {
            System.out.println(st);
        }
    }
    static StudentComparator co = new StudentComparator();

}