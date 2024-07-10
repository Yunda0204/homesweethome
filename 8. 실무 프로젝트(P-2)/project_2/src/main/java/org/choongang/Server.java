package org.choongang;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerScoket serverScoket = new ServerSocket(9999);
        while (true) {
            System.out.println("서버 대기중..");
            Socket socket = serverScoket.accept();

            System.out.println("클라이언트 서버 접속 : " + socket);

        }
    }
}
