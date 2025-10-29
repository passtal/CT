package day07.Ex04_빌더패턴;

public class Pikachu {

	// 변수

	private int energy;
	private String type;
	private int level;

	// private 생성자
	private Pikachu(Builder builder) {
		this.energy = builder.energy;
		this.type = builder.type;
		this.level = builder.level;

	}

	// Builder 클래스를 static 이너 클래스로 정의
	public static class Builder {
		private int energy;
		private String type;
		private int level;
		// 각 변수를 초기화하고 인스턴스를 반환하는 메소드 정의
		public Builder energy(int energy) {
			this.energy = energy;
			return this;
		}
		
		public Builder type(String type) {
			this.type = type;
			return this;
		}
		
		public Builder level(int level) {
			this.level = level;
			return this;
		}
		
		public Pikachu build() {
			return new Pikachu(this);
		}
	}


	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}

}
