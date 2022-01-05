package com.company;

import java.util.*;

public class study1darray
{
    public static void main(String[] args) { Scanner s1=new Scanner(System.in); int[] arr;
        arr=new int[5];
        System.out.println("Enter the Array1 =>"); for (int i=0; i<arr.length;i++ )
        {
            arr[i]=s1.nextInt();
        }
        for (int i=0; i<arr.length;i++ )
        {
            System.out.print(arr[i]+" ");
        }
    }
}
