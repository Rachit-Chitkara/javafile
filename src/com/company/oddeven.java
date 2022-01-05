package com.company;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Number=>");
        int num = s1.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        } else {
            System.out.println("Entered Number is Odd");
        }
    }
}
