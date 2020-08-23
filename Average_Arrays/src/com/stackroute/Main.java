package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements to be inserted:");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++)
        {
            System.out.println("Enter the "+(i+1)+" number to be inserted:");
            arr[i] = s.nextInt();
        }

        System.out.print("Average of the Array:"+m.average(arr));

    }

    public double average(int [] arr)
    {
        int sum = 0;
        for (int i=0; i<arr.length;i++)
        {
            sum= sum+arr[i];
        }
        double avg = sum/(arr.length);
        return avg;
    }
}
