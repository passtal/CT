package day11.Ex01_Serialization;

import java.io.Serializable;

// 직렬화
// ㄴ Serializable 인터페이스를 구현해야 직렬화 객체를 정의할 수 있다.
// 직렬화? 객체 -> 바이트 스트림 형태로 변환

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
//	private static final long serialVersionUID = 2L;
//	버전이 바뀐다면 adress가 새로 추가되었기 때문에 직렬화 및 역직렬화가 되지 않는다 (버전이 바뀌어 참조를 못하기 때문)
	
	private String name;
	private int age;
	
	// 변수 추가
	
	private String adress;
	
	// 기본 생성자
	
	public Person() {
		
	}

	// 매개 변수가 있는 생성자
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// toString
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
