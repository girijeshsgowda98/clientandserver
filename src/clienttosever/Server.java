package clienttosever;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException{
        int number,temp;
        ServerSocket sc1=new ServerSocket(1342);
        Socket ss=sc1.accept();
        Scanner sc=new Scanner(ss.getInputStream());
        number=sc.nextInt();
        temp=number*2;
        PrintStream p=new PrintStream(ss.getOutputStream());
        p.println(temp);
    }


}
