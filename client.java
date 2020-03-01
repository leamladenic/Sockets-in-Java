import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 4999);
        Scanner myObj = new Scanner(System.in);

        if (s != null) {
            System.out.println("Enter your name: ");
            String userName = myObj.nextLine();
            PrintWriter pr = new PrintWriter(s.getOutputStream());
            pr.println(userName);
            pr.flush();
        }

    }
}
