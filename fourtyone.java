package com.example.learnJava;

import java.io.File;
import java.util.Scanner;

public class fourtyone {
    public static void main(String args[]) throws Exception{
        String name;

        int a, b, c, d, sum;

        System.out.println("Getting name and 3 numbers from file....");

        Scanner filein= new Scanner(new File("name-and-numbers.txt"));

        name=filein.nextLine();
        a=filein.nextInt();
        b=filein.nextInt();
        c=filein.nextInt();

        filein.close();

        System.out.println("DONE!");
        System.out.println("Your Name is; \t "+ name);
        sum=a+b+c;
        System.out.println(a+" + "+b+" + "+c+" = "+ sum);

    }
}
