package com.company;

import java.util.Scanner;

public class pow {
    public static int powr(int base, int power) { if (power != 0) {
        return (base * powr(base, power - 1));
    } else {
        return 1;
    }
    }

    public static void main(String[] args) { Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the base and power"); int base = s1.nextInt();
        int power = s1.nextInt();
        int result = powr(base, power); System.out.println("Result=> " + result);
    }
}
