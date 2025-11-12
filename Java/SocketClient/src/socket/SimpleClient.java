package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
	
	public static void main(String[] args) {
		String serverAddress = "192.168.30.19";
		int port = 9999;
		
		try (Socket socket = new Socket(serverAddress, port);
			 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			 Scanner sc = new Scanner(System.in)) {
			
			System.out.println("서버에 연결됨. 'exit' 입력 시 종료.");
			
			Thread receiver = new Thread(() -> {
				try {
					String response;
					while ((response = in.readLine()) != null) {
						System.out.println("[서버 응답] " + response);
					}
				} catch (Exception e) {
					System.out.println("서버 연결 종료됨");
				}
			});
			
			receiver.start();
			
			while (true) {
				System.out.print("나: ");
				String input = sc.nextLine();
				
				if (input.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트 종료 요청됨");
					break;
				}
				
				out.println(input); // 서버로 채팅 보냄 ~ 서버에서 echo 응답 (맞나?)
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}