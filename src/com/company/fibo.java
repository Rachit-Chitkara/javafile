package com.company;

import java.util.Scanner;

public class fibo
{
    static int fib(int n)
    {
        if(n<=1)
            return n;

        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) { Scanner s1=new Scanner(System.in); System.out.print("Enter the number=> ");
        int num=s1.nextInt(); for(int i=0;i<num;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
}
