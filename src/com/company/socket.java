package com.company;

import java.io.*;
import java.net.*;

class socket {
    public static void main(String ar[]) {
        int c;
        Socket s = null;
        String msg = null;
        InputStream in = null;
        OutputStream out = null;
        try {
            s = new Socket("whois.internic.net", 43);
            in = s.getInputStream();
            out = s.getOutputStream();
            msg = (ar.length == 0 ? "google.com\n" : ar[0] + "\n");
            byte buf[] = msg.getBytes();
            out.write(buf);
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            System.out.print("error: " + e.getMessage());
        }
    }
}
