package com.company;

import java.util.*;

public class arraysort {
    public static void main(String[] args) { Scanner s1 = new Scanner(System.in); int[] arr;
        arr = new int[5]; System.out.println("Enter the Array=>"); for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { if (arr[j] > arr[j + 1]) {
                int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
            }
            }
        }
        for (int i = 0; i < arr.length; i++) { System.out.print(arr[i] + " ");
        }
    }
}
