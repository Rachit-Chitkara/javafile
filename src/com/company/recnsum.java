package com.company;

import java.util.Scanner;

public class recnsum {
    public static int nsum(int n) { if (n == 0)
        return 0;
        return n + nsum(n - 1);
    }

    public static void main(String[] args) { Scanner s1 = new Scanner(System.in); System.out.println("Enter the Number=>"); int num = s1.nextInt(); System.out.println("Sum is " + nsum(num));
    }
}

