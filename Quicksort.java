package com.company;

import java.util.Scanner;

public class Main
{
    public static void sort(int[] array)
    {
        quickSort(array, 0, array.length - 1);
    }
    public static void quickSort(int array[], int low, int high)
    {
        int i = low, j = high;
        int temp;
        int pivot = array[(low + high) / 2];

        while (i <= j)
        {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j)
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (i < high)
            quickSort(array, i, high);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter number of integer elements");
        int num = scan.nextInt();
        int array[] = new int[ num ];
        System.out.println("\nEnter "+ num +" integer elements");
        for (int i = 0; i < num; i++)
            array[i] = scan.nextInt();
        sort(array);
        System.out.println("\nElements after sorting ");
        for (int i = 0; i < num; i++)
            System.out.println(array[i]);
    }
}
