package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓이 있어야 함.
		DatagramSocket socket = new DatagramSocket();
		
		// UDP용 패킷이 있어야 함. 정해져 있는 길이 없기 때문에 (데이터, 데이터의 크기, ip, port)정보를 가지고 있어야 함
		String s = "i am a java programmer...";
		byte[] data = s.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1"); // 보내는 ip주소 : 129.0.0.1(localhost)
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		
		// 소켓을 이용해서 패킷을 보낸다
		socket.send(packet);
		socket.close();
	}

}
