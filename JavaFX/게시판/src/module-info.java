module 게시판 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires lombok;
	requires javafx.base;
	requires java.desktop;
	
	// controller에서 fxml 모듈을 사용하도록 열어준다.
	opens application.controller to javafx.fxml;
	
	// DTO에서 base 모듈을 사용하도록 열어준다
	opens application.DTO to javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}