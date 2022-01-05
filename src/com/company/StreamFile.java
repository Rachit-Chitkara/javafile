package com.company;

import java.io.FileWriter;
import java.io.FileReader;

class StreamFile {
    public static void main(String[] args) {

        char[] array = new char[31];
        try {
            FileReader input = new FileReader("newFile.txt");
            input.read(array);
            System.out.println(array);
            input.close();

            String data = new String(array);
            System.out.println(data);

            FileWriter output = new FileWriter("output.txt");
            output.write(data);
            System.out.println("Data is written to the file.");
            output.close();

            FileReader fin = new FileReader("output.txt");
            fin.read(array);
            System.out.println(array);
            fin.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
