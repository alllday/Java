package 네트워크프로그램;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			// 서버랑 클라이언트랑 양쪽에 전화기역할을 하는 Socket이 있어야 한다.
			// 클라이언트에서 Socket을 만들어주면, 서버Socket으로 승인요청을 보냄.
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트 승인 요청 보냄!");
		}
	}

}
