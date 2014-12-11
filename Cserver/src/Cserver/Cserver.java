package Cserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cserver extends Thread {

	Cserver(int a) {
		b = a;
		try {
			sS= new ServerSocket(a);
			sS.setSoTimeout(10000);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	int b = 0;
	
	ServerSocket sS = null;
	

	public void run() {
		System.out.println("1");
		while(true){
			try {
				Socket c = sS.accept();
				DataInputStream dis = new DataInputStream(c.getInputStream());
				System.out.println(dis.readUTF());
				DataOutputStream ot = new DataOutputStream(c.getOutputStream());
				ot.writeUTF("aaaaaaaaa");
				c.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}
		

	public static void main(String[] args) {
		Thread abcd = new Cserver(2000);
		abcd.start();
		
	}
}
