// A Java program for a Client
import java.net.*;
import java.io.*;

public class TCPClient {
	// initialize socket and input output streams
	private Socket socket		 = null;
	private BufferedReader input = null;
	private DataOutputStream out	 = null;
	private static TCPClient client;

	// constructor to put ip address and port
	public TCPClient(String address, int port) {
		// establish a connection
		try {
			socket = new Socket(address, port);
			System.out.println("Connected");

			// takes input from terminal
			input = new BufferedReader(new InputStreamReader(System.in));

			// sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());
		} catch(UnknownHostException u) {
			System.out.println(u);
		} catch(IOException i) {
			System.out.println(i);
		}

		// string to read message from input
		String line = "";

		// keep reading until "Over" is input
		while (!line.equals("Over")) {
			try {
				line = input.readLine();
				out.writeUTF(line);
			}
			catch(IOException i) {
				System.out.println(i);
			}
		}

		// close the connection
		try {
			input.close();
			out.close();
			socket.close();
		}
		catch(IOException i) {
			System.out.println(i);
		}
	}

	public static TCPClient getClient() {
		return client;
	}

	public static void setClient(TCPClient client) {
		TCPClient.client = client;
	}

	public static void main(String args[]) {
		setClient(new TCPClient("127.0.0.1", 5000));
	}

    public static void send(String text) {
    }
}
