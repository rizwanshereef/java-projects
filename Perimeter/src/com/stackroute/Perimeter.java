package com.stackroute;
import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length= s.nextInt();
        System.out.println("Enter the breadth:");
        int breadth = s.nextInt();
        int perimeter = 2 * (length+breadth);
        System.out.println("Perimeter=" +perimeter);
    }
}
