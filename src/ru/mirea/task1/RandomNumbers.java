package ru.mirea.task1.opt3;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){
        double[] arr= new double[10];
        for(int i=0; i<arr.length;i++){
            double a = 10 + Math.random()*70;
            arr[i]=a;
            String str = String.format("%.1f", arr[i]);
            System.out.print(str +" ");
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length-1;j++)
                if (arr[j] > arr[j+1]) {
                    double tmp;
                    tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = tmp;
                }
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            String str = String.format("%.1f", arr[i]);
            System.out.print(str +" ");
        }
    }
}