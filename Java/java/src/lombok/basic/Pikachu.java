package lombok.basic;

import lombok.Builder;
import lombok.Data;

@Data		// @ Getter . Setter . ToString . RAC . EHC

@Builder

public class Pikachu {
	
	// 필수 생성자로 지정되기 위해서는 @NN 또는 해당 코드 앞에 final을 선언해 주어야 한다.
	// 기본 생성자가 안보이는 듯 해도 컴파일러가 자동으로 생성해주기 때문에 무조건 존재한다.
	
	final int energy;
	String type;
	int level;
}
