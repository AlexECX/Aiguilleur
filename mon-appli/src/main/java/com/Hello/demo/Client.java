package com.Hello.demo;

import java.io.IOException;
import java.net.Socket;

/**
 * Client
 */
public class Client {
    private Socket my_socket;

    public Client(String addr, int port) throws IOException {
        my_socket = new Socket(addr, port);
        System.out.println("client is running");
    }

}