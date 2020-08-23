package com.stackroute;

import java.util.Scanner;

public class SortInteger
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c,d,temp=0;
        System.out.println("Enter 1st number:");
        a = s.nextInt();
        System.out.println("Enter 2nd number:");
        b = s.nextInt();
        System.out.println("Enter 3rd number:");
        c = s.nextInt();
        System.out.println("Enter 4th number:");
        d = s.nextInt();

        if(a>b)
        {
            temp = a;
            a = b;
            b = temp;
        }
        if(c>d)
        {
            temp = c;
            c = d;
            d = temp;
        }
        if(a>c)
        {
            temp = a;
            a = c;
            c = temp;
        }
        if(b>d)
        {
            temp = b;
            b = d;
            d = temp;
        }
        if(b>c)
        {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Sorted order:"+ a + " "+ b +" "+ " "+c+ " "+ d);

    }
}

