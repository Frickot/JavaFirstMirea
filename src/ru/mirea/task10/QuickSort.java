package ru.mirea.task10;



public class QuickSort {
    public static void Sorting(Student1[] array, int low, int high) {
        StudentComparator co = new StudentComparator();
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student1 opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (co.compare(array[i],opora) < 0) {
                i++;
            }
            while (co.compare(array[j],opora) > 0) {
                j--;
            }
            if (i <= j) {
                Student1 temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            Sorting(array, low, j);

        if (high > i)
            Sorting(array, i, high);
    }
}