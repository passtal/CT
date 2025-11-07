package day09.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList반복 {

	public static void main(String[] args) {

		ArrayList<String> cart = new ArrayList<>();

		System.out.println("가지고 싶은 물건 5가지 입력하기");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String product = sc.nextLine();
			cart.add(product);
		}
		System.out.println();
		System.out.println("--------------------------");

		// 반복2 - foreach
		for (String product : cart) {
			System.out.println(product + " ");
		}
		System.out.println();
		System.out.println("--------------------------");

		// 반복3 - Iterator (for)
		// for 자동완성 첫번째
		for (Iterator iterator = cart.iterator(); iterator.hasNext();) {
			String product = (String) iterator.next();
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------");

		// 반복 4 - Iterator (while)
		Iterator<String> it = cart.iterator();

		// while 자동완성 두번째
		while (it.hasNext()) {
			String product = (String) it.next();
			System.out.println(product + " ");
		}
		System.out.println();
		System.out.println("--------------------------");

		sc.close();
	}

}
