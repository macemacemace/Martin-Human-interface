import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

void main() {
    String host = "localhost";
    int port = 8080;

    try (Socket socket = new Socket(host, port);
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         Scanner scanner = new Scanner(System.in);
    ) {
        System.out.println("Connected to server on port: " + port);
        System.out.println("Enter a number: ");

        while (true)
        {
            System.out.println(">");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) break;

            out.println(input);
            String response = in.readLine();
            System.out.println("Response from server: " + response);
        }
        System.out.println("Server stopped.");

    } catch (IOException e)
    {
        e.printStackTrace();
    }
}