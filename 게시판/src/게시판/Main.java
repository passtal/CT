package 게시판;

/**
 * ※ 라이브러리 ※
 * → JDBC 드라이버
 * → Lombok
 * 
 * ※ 아키텍처 ※
 * → 3 계층 아키텍처
 * 	→ 프레젠테이션 계층
 * 		→ Main.java
 * 	→ 비즈니스 로직 계층
 * 		→ BoardService.java
 * 		→ BoardServiceImpl.java
 *  → 데이터 접근 계층
 *  	DTO : Board.java
 *  	DAO : Board.java
 *  
 * ※ 기능 ※
 * → 게시글 목록 조회 등록 수정 삭제
 * 
 * ※ JDBC ※
 *  → Connection	(을 통해 하위 인터페이스 생성)
 *  → Statement		(단순 SQL 명령어 요청 인터페이스)
 *  → PreparedStatement		(? 파라미터 매핑 요청 인터페이스) ... setXXX - 번호, 매핑값 , ? 번호값세팅
 *  → ResultSet
 *  
 *  
 *  → executeQuery() 	: SELECT 조회 명령어 요청 메소드
 *  → executeUpdate()	: INSERT, UPDATE, DELETE 명령어 요청 메소드
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import 게시판.DTO.Board;
import 게시판.Service.BoardService;
import 게시판.Service.BoardServiceImpl;

public class Main {
	
	static Scanner sc = new Scanner(System.in);						// 입력 객체
	static List<Board> boardList = null;							// 게시글 목록
	static BoardService boardService = new BoardServiceImpl();		// 비즈니스 로직 객체
	private static List<Board> list;
	
	/**
	 * 메뉴판
	 */
	
	public static void menu() {
		System.out.println(":::::::::: 게시판 ::::::::::");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println(":::::::::: 번호 입력 : ");
	}
	
	/**
	 * 게시글 목록
	 */
	
	public static void list() {
		System.out.println(":::::::::: 게시글 목록 ::::::::::");
		// 게시글 목록 데이터 요청
		boardList = boardService.list();
		printAll(boardList);
	}
	
	/**
	 * 글 목록 전체 출력
	 * @param list
	 */

	private static void printAll(List<Board> boardList2) {
		// 글 목록이 존재하는지 확인
		if (list == null || list.isEmpty()) {
			System.err.println("조회된 글이 없습니다.");
			return;
		}
		// 글 목록 출력
		for (Board board : boardList2) {
			print(board);
		}
	}

	private static void print(Board board) {
		if (board == null) {
			System.err.println("조회할 수 없는 게시글입니다.");
			return;
		}
		
		int no = board.getNo();
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date createdAt = board.getCreatedAt();
		Date updatedAt = board.getUpdatedAt();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String reg = sdf.format(createdAt);
		String upd = sdf.format(updatedAt);
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		System.out.println("★ 글번호 : " + no);
		System.out.println("★ 제목 : " + title);
		System.out.println("★ 작성자 : " + writer);
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		System.out.println(" " + content);
		System.out.println("★ 등록일자 : " + reg);
		System.out.println("★ 수정일자 ★ " + upd);
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		
	}
	
	public static void select() {
		System.out.println(":::::::::: 게시글 조회 ::::::::::");
		System.out.print("글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		Board board = boardService.select(no);
		print(board);
	}
	
	public static void insert() {
		System.out.println(":::::::::: 게시글 등록 ::::::::::");
		Board board = input();
		// 게시글 등록 요청
		int result = boardService.insert(board);
		if (result > 0) {
			System.out.println("★ 게시글이 등록되었습니다.");
		} else {
			System.out.println("★ 게시글 등록에 실패하였습니다.");
		}
	}

	private static Board input() {
		System.out.println("★ 제목 : ");
		String title = sc.nextLine();
		System.out.println("★ 작성자 : ");
		String writer = sc.nextLine();
		System.out.println("★ 내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content);
		return board;
	}
	
	public static void update() {
		System.out.println(":::::::::: 게시글 수정 ::::::::::");
		
		System.out.print("게시글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		Board board = input();
		board.setNo(no);
		
		// 게시글 수정 요청
		int result = boardService.update(board);
		if (result > 0) {
			System.out.println("★ 게시글이 수정되었습니다.");
		} else {
			System.out.println("★ 게시글 수정에 실패하였습니다.");
		}
	}
	
	public static void delete() {
		System.out.println(":::::::::: 게시글 삭제 ::::::::::");
		
		System.out.print("게시글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		// 게시글 삭제 요청
		int result = boardService.delete(no);
		if (result > 0) {
			System.out.println("★ 게시글이 삭제되었습니다.");
		} else {
			System.out.println("★ 게시글 삭제에 실패하였습니다.");
		}
	}
	
	public static void main(String[] args) {
		int menuNo = 0;
		
		do {
			// 메뉴판 출력
			menu();
			
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			// 0 → 프로그램 종료
			if (menuNo == 0) break;
			
			switch (menuNo) {
				case 1: list(); break;			// 게시글 목록
				case 2: select(); break;		// 게시글 조회
				case 3: insert(); break;		// 게시글 등록
				case 4: update(); break;		// 게시글 수정
				case 5: delete(); break;		// 게시글 삭제
			}
		} while (menuNo != 0);
		System.out.println("프로그램 종료합니다...");
	}

}
