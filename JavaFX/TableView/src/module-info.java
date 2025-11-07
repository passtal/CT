module TableView {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.base;
	requires lombok;
	
	opens application to javafx.graphics, javafx.fxml;
}
