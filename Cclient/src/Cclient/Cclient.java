package Cclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cclient {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.168.56.1", 2000);
			DataOutputStream d = new DataOutputStream(s.getOutputStream());
			d.writeUTF("æ»≥Á«œººø‰");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			s.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
