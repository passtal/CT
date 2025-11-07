package day06.Ex02_인터페이스;

public class Driver {

	public static void main(String[] args) {
		// 인터페이스를 구현한 클래스 객체를 만드는 법
		// 인터페이스 타입 객체명 = new 구현클래스();

		// RC카
		RemoteControl carRC = new RcCar();
		carRC.turnON();
		carRC.parking(false);
		carRC.setSpeed(20);
		carRC.parking(true);
		carRC.turnOFF();
		System.out.println();

		// static 메소드는 객체 생성 없이도 바로 호출 가능
		RemoteControl.changeBattery();
		System.out.println();

		RemoteControl droneRc = new Drone();
		droneRc.turnON();
		// 디폴트 메소드는 구현하지 않아도 바로 호출가능
		// = 오버라이딩을 하지 않아도 바로 호출 ok
		droneRc.parking(false);
		droneRc.setSpeed(15);
		droneRc.parking(true);
		droneRc.turnOFF();
		System.out.println();
	}

}
