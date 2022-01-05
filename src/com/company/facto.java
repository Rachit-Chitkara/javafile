package com.company;

import java.util.Scanner;

public class facto {
    public static void main(String[] args) { Scanner s1 = new Scanner(System.in); System.out.println("Enter the Number=>"); int num = s1.nextInt();
        int fact = 1;
        for (int i = 2; i <= num; i++) { fact *= i;
        }
        System.out.println("Factorial=>" + fact);
    }
}
