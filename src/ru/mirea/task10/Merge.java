package ru.mirea.task10;

public class Merge {
    public static Student1[] sortArray(Student1[] arrayA, Options option){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        Student1[] arrayB = new Student1[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        Student1[] arrayC = new Student1[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
        arrayB = sortArray(arrayB, option);
        arrayC = sortArray(arrayC, option);

        return mergeArray(arrayB, arrayC, option);
    }
    public static Student1[] mergeArray(Student1[] arrayA, Student1[] arrayB, Options option) {

        Student1[] arrayC = new Student1[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                switch (option) {
                    case name:
                        if (arrayA[positionA].getName().compareTo(arrayB[positionB].getName()) > 0) {
                            arrayC[i] = arrayA[positionA];
                            positionA++;
                        }else {
                            arrayC[i] = arrayB[positionB];
                            positionB++;
                        }
                        break;
                    case surname:
                        if (arrayA[positionA].getSurname().compareTo(arrayB[positionB].getSurname()) > 0) {
                            arrayC[i] = arrayA[positionA];
                            positionA++;
                        }else {
                            arrayC[i] = arrayB[positionB];
                            positionB++;
                        }
                        break;
                    case specialty:
                        if (arrayA[positionA].getSpecialty().compareTo(arrayB[positionB].getSpecialty()) > 0) {
                            arrayC[i] = arrayA[positionA];
                            positionA++;
                        }else {
                            arrayC[i] = arrayB[positionB];
                            positionB++;
                        }
                        break;
                    case group:
                        if (arrayA[positionA].getGroup().compareTo(arrayB[positionB].getGroup()) > 0) {
                            arrayC[i] = arrayA[positionA];
                            positionA++;
                        }else {
                            arrayC[i] = arrayB[positionB];
                            positionB++;
                        }
                        break;
                    case course:
                        if (arrayA[positionA].getCourse() > arrayB[positionB].getCourse()) {
                            arrayC[i] = arrayA[positionA];
                            positionA++;
                        }else {
                            arrayC[i] = arrayB[positionB];
                            positionB++;
                        }
                        break;
                    case GPA:
                        if (arrayA[positionA].getGPA() > arrayB[positionB].getGPA()) {
                            arrayC[i] = arrayA[positionA];
                            positionA++;
                        }else {
                            arrayC[i] = arrayB[positionB];
                            positionB++;
                        }
                        break;
                }
            }
        }
        return arrayC;
    }
}