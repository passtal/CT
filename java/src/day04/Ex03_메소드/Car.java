package day04.Ex03_메소드;

public class Car {
	
	// 모델명 속도
	/* 생성자
	 * 기본 생성자
	 * model 매개변수 생성자
	 * 전체 매개변수 생성자
	 * getter & setter */
	String model;
	private int speed;
	public Car() {
		this("모델명 없음", 0);
	}
	public Car(String model) {
		this.model = model;
	}
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	// getter			: 변수의 값을 가져오는 메소드
	// setter			: 변수의 값을 지정하는 메소드
	// 이름 권장규칙		: getXXX(), setXXX()
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			speed = 0;
			// syserr crtl space
			System.err.println("속도는 음수가 될 수 없습니다.");
		}
		if (speed >= 300) {
			speed = 300;
			System.out.println("최대 속도는 300km/h 입니다.");
			
		}
	
		this.speed = speed;
	
	}
	
}