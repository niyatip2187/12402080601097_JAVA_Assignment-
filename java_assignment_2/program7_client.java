import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            String msg;

            System.out.println("Enter message (type 'exit' to quit):");

            while (true) {
                msg = sc.nextLine();

                if (msg.equalsIgnoreCase("exit")) {
                    break;
                }

                out.println(msg); // send to server

                String response = in.readLine();
                System.out.println("Server: " + response);
            }

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
