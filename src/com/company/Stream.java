package com.company;

import java.io.*;

public class Stream {
    public static void main(String[] args) throws IOException {
        String names;
        InputStreamReader s = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(s);

        for (int i = 0; i < 10; i++) {
            names = br.readLine();
            System.out.println(names);
        }
    }

}
