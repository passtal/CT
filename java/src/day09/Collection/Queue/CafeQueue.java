package day09.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CafeQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		// 손님 줄서기
		queue.add("마동석");
		queue.add("최민식");
		queue.add("하정우");

		System.out.println("현재 대기줄 : " + queue);

		// 손님 응대
		while (!queue.isEmpty()) {
			System.out.println(queue.peek() + "님 어서오세요!");
			String customer = queue.poll(); // 맨 앞 사람 응대
			System.out.println(customer + "님 주문하신 음료 나왔습니다!");
			System.out.println("남은 대기줄 : " + queue);
		}

		System.out.println("대기자가 없습니다.");
	}

}
