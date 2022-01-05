package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL u = new URL("https://www.msit.in/");
        System.out.println(" the protocol is ..." + u.getProtocol());
        System.out.println("the host is ........" + u.getHost());
        System.out.println("the port is ........" + u.getPort());
        System.out.println("the file is ........" + u.getFile());
        System.out.println("the file is ........" + u.toExternalForm());

        URLConnection ucon = u.openConnection();
        long d = ucon.getDate();

        if (d == 0) {
            System.out.println("No date information...");
        } else {
            System.out.println("the expiration date is .." + new Date(d));
        }

        System.out.println("The content type is ..." + ucon.getContentType());
        long g = ucon.getLastModified();

        if (g == 0) {
            System.out.println(" No last modification date information...");
        } else {
            System.out.println("the last modified date is .." + new Date(g));
        }

        long len = ucon.getContentLengthLong();
        if (len != 0) {
            System.out.println(" the content is ......");
            InputStream in = ucon.getInputStream();

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            in.close();
        } else {
            System.out.println(" No data is available...");
        }
    }
}

