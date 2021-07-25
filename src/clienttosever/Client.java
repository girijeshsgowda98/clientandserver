package clienttosever;

import java.net.Socket;
import java.io.*;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException,IOException {
        int number,temp;
        Scanner sc1=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",1342);
        Scanner sc2=new Scanner(s.getInputStream());
        System.out.println("enter the number");
        number=sc1.nextInt();
        PrintStream p=new PrintStream(s.getOutputStream());
        p.println(number);
        temp=sc2.nextInt();
        System.out.println(temp);
    }
}
