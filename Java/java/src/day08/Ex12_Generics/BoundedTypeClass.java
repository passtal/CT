package day08.Ex12_Generics;

class X {
}

class A extends X {
}

class B extends A {
}

class C extends A {
}

// 타입 매개변수를 A 클래스와 그 하위 클래스로만 가능하도록 제한

class D<T extends A> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

// Number 클래스 타입 매개변수로 사용가능하도록 제한
// (Integer, Double) 등 숫자타입 클래스만 사용가능하도록 제한

class E<T extends Number> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

public class BoundedTypeClass {

	public static void main(String[] args) {

		// (오류코드 . 에러) D<X> d0 = new D<X>();
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();

		d1.setT(new A());
		d2.setT(new B());
		d3.setT(new C());

		d1.setT(new B()); // A ← B 업캐스팅
		d1.setT(new C()); // A ← C 업캐스팅

		// d2.setT(new A()); 오류코드 . 에러
		// d2.setT(new A()); 오류코드 . 에러
		// ㄴ d2<B>, d3<C> ← 부모 객체인 A 대입 불가
		// 위의 두 코드는 모두 다운캐스팅 상황인데, 다운캐스팅은 업캐스팅이 전제되어야 가능함
		// 하지만, 업캐스팅없이 다운캐스팅이 이루어졌으므로 잘못된 코드이다.
		// 위 두 코드가 성립이 되기 위해선 d1의 경우처럼 업캐스팅 코드를 먼저 작성해주어야 한다.

		// 다운캐스팅
		// A a = new B(); // 업캐스팅
		// B b = (B) a; // 다운캐스팅

		// E <T extends Number>
		// Number 클래스로 제한했기때문에 숫자 타입인 클래스만 타입 지정이 가능함

		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		// 오류코드. 에러 - 숫자타입 아님 - E <Boolean> e4 = new E<Boolean>();

		e1.setT(100);
		System.out.println(e1.getT());

		e2.setT(12.34);
		System.out.println(e2.getT());

		// 그냥 쓴 정수는 (127) -> int 타입으로 인식 -> 4byte
		// e3 객체에 지정한 타입은 Byte(byte) -> 1byte 이기 때문에 강제 형변환이 필요하다

		e3.setT((byte) 127);
		System.out.println(e3.getT());

	}

}
