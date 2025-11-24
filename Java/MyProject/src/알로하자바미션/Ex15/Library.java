package 알로하자바미션.Ex15;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("123123", "이게 자바냐", "감자바", "자바 감자바", 33000));
		bookList.add(new Book("112112", "정보처리기사", "김조은", "국가기술자격", 45000));
		bookList.add(new Book("001001", "실무 DB", "박디비", "디비디비딥", 60000));
		
		System.out.println("==================== ALOHA 스터디도서관====================");
		
		for (Book book : bookList) {
			System.out.println(book.toString());
		}
	}

}
