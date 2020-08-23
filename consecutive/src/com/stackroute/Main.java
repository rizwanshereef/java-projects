package com.stackroute;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter the numbers separated by commas:");
        str = s.next();
        String[] values = str.split(",");
        m.cons(values);
    }

    public void cons(String[] str)
    {
        int i, flag = 0;
        String[] ch = str;
        int[] num = new int[str.length];
        for (i = 0; i<str.length; i++)
        {
            num[i]= Integer.parseInt(ch[i]);
        }
        Arrays.sort(num);
        for(i=0; i< num.length-1;i++)
        {
            if((num[i+1] - num[i])==1)
            {
                flag = 1;

            }
            else {
                flag =0;
            }
        }

        if(flag == 1)
        {
            System.out.println("Numbers are consecutive");
        }
        else {
            System.out.println("Numbers are not consecutive");
        }
    }

}
