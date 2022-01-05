package com.company;

import java.util.*;

public class study2darray {
    public static void main(String[] args) { Scanner s1 = new Scanner(System.in); int[][] arr;
        arr = new int[3][3]; System.out.println("Enter the Array =>"); for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) arr[i][j] = s1.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

