package com.company;

import java.net.InetAddress;

class Network {
    public static void main(String[] ar) throws Exception {
        InetAddress localIP = InetAddress.getLocalHost();
        System.out.println("IP address of the local machine is : " + localIP);

        System.out.print("Address of the local machine byte by byte : ");
        byte[] byteAdd = localIP.getAddress();
        for (byte b : byteAdd) {
            System.out.print(b + " ");
        }
        System.out.println();

        InetAddress ipName = InetAddress.getByName("www.msit.in");
        System.out.println("IP Name : " + ipName);

        InetAddress[] ipAdd = InetAddress.getAllByName("www.msit.in");
        System.out.println("Addresses assigned to MSIT");
        for (InetAddress i : ipAdd) {
            System.out.println(i);
        }
    }
}
