package 메신저프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저B extends JFrame {
	DatagramSocket socket;
	JTextArea list;
	JTextField input;

	public 메신저B() {
		try {
			socket = new DatagramSocket(5555);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		list = new JTextArea();
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setTitle("메신저B");
		setSize(300, 300);
		list.setBackground(Color.pink);
		input.setBackground(Color.green);
		Font font = new Font("궁서", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // UDPSender 복붙
				// 1. 입력한 것 가지고 오세요
				String s = input.getText();
				try {
					// UDP용 소켓이 있어야 함.
					DatagramSocket socket = new DatagramSocket();
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1"); // 보내는 ip주소 : 127.0.0.1(localhost)
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777); // 메신저B 포트는 5555
					list.append("나 >> " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});

		setVisible(true);
	}

	public void process() {
		while (true) { // UDPReceiver 내용 복붙
			try {
				System.out.println("받을 준비중...");

				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);

				socket.receive(packet);

				list.append("너 >> " + new String(data) + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		메신저B name = new 메신저B();
		name.process();
	}

}
