package com.Hello.demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server
 */
public class Server {
    private ServerSocket my_socket;

    public Server(int port) throws IOException {
        my_socket = new ServerSocket(port);
        System.out.println("server is running");
        my_socket.accept();
       
    }
    

}