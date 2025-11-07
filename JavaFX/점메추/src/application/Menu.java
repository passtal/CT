package application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data					// ~~
@NoArgsConstructor		// 기본 생성자
@AllArgsConstructor		// 전체 매개변수 생성자
public class Menu {
	
	String menu;		// 메뉴 이름
	String img;			// 이미지 경로

}
