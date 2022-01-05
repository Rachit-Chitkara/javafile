package com.company;

import java.util.Scanner;

public class typecasting
{
    public static void main(String[] args) {
//Widening int to float
int x=7;
        long y=x; float z=y;
        System.out.println("int-> "+x); System.out.println("long-> "+y); System.out.println("float-> "+z); System.out.println("");

//Narrowing int to byte
int a=13;
        char b=(char)a; short c=(short)b; byte d=(byte)c;
        System.out.println("int-> "+a); System.out.println("char-> "+b); System.out.println("short-> "+c); System.out.println("byte-> "+d);

    }
}
