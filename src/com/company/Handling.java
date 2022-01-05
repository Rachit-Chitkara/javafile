package com.company;

public class Handling {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        str.append(" World!");
        System.out.println(str);
        str.deleteCharAt(8);
        System.out.println(str);
        str.reverse();
        System.out.println(str);

    }
}
