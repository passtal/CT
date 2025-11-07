package day08.Ex13_WildCard;

import day05.Ex01_상속.Pikachu;
import day05.Ex01_상속.Raichu;

public class BoxWildCard {

	public static void main(String[] args) {
		Box<?> wildCardBox = new Box<>();

		Box<String> box1 = new Box<>();
		box1.setT("String Box");

		Box<?> wBox = box1;

		// Number 클래스 하위 클래스 허용
		Box<Integer> box2 = new Box<>();
		Box<Double> box3 = new Box<>();
		Box<Byte> box4 = new Box<>();

		Box<? extends Number> wBox2 = box2;
		wBox2 = box3;
		wBox2 = box4;
		// (오류코드. 에러) wBox2 = box1; → String으로 제한했기 때문

		// Raichu 와 상위 클래스 허용
		Box<Pikachu> box5 = new Box<>();
		Box<Raichu> box6 = new Box<>();
		Box<? super Raichu> wBox3 = box5;
		Box<? super Raichu> wBox4 = box6;

		// (?) ~ 와일드카드 사용시 타입 관련없이 전부 사용 가능
		wildCardBox = box1; // String
		wildCardBox = box2; // Integer
		wildCardBox = box3; // Pikachu

	}

}
