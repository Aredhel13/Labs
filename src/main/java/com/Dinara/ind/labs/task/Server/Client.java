package com.Dinara.ind.labs.task.Server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/*
public class Client {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("localhost",9000));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Writer writer = new OutputStreamWriter(socket.getOutputStream());
        while (true){
            writer.write(reader.readLine()+"/r/n");
        }

    }
}


public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        int portNumber = 8000;
        try{
            socket = new Socket ("localhost",portNumber);
        }catch (IOException e){
            System.err.println("Ошибка при подключении");
            e.printStackTrace();
        }
    }
}

 */

public class Client{
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 8000);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String msgin = "", msgout = "";

            while(!msgin.equals("end")){
                msgout = br.readLine();
                dout.writeUTF(msgout);
                msgin = din.readUTF();
                System.out.println(msgin);
            }
        }catch(Exception e){

        }
    }
}