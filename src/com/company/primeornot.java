package com.company;

import java.util.Scanner;

public class primeornot
{
    public static void main(String[] args) { Scanner s1=new Scanner(System.in);
        System.out.println("Enter the Number =>"); int num=s1.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) { if (num % i == 0) {
            flag = true; break;
        }
        }

        if (!flag)
            System.out.println(num + " is a prime number."); else
            System.out.println(num + " is not a prime number.");
    }
}
