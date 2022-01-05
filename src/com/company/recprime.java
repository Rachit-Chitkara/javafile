package com.company;

import java.util.Scanner;

public class recprime {
    static boolean isPrime(int n, int i) { if (n == 2) {
        return true;
    }
        if (n % i == 0) { return false;
        }
        if (i * i > n) { return true;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) { Scanner s1 = new Scanner(System.in); System.out.println("Enter the Number=>"); int num = s1.nextInt();
        if (isPrime(num, 2)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
