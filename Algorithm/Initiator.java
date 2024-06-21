

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Initiator {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String msg = "INITIATOR-" + "INI" + "," + args[0] + "," + args[0];
		//dSystem.out.println("msg:"+msg);
		byte buff[] = msg.getBytes();
		DatagramPacket dgPacketSend = new DatagramPacket(buff, buff.length, InetAddress.getLocalHost(),
				Integer.parseInt(args[0]) * 1000);
		DatagramSocket dgSocket =new DatagramSocket(55 * 1000);
		dgSocket.send(dgPacketSend);
		System.out.println("INITIATED FOR PROCESS ID :"+args[0]);
		dgSocket.close();
	}
}
