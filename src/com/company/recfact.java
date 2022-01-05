package com.company;

import java.util.Scanner;

public class recfact {
    public static int factorial(int n) { if (n == 0) {
        return 1;
    }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) { Scanner s1 = new Scanner(System.in); System.out.println("Enter the Number=>"); int num = s1.nextInt();
        System.out.println("Factorial is " + factorial(num));
    }
}
