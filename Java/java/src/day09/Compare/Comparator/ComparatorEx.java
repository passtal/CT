package day09.Compare.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

class Product implements Comparator<Product> {

	String code; // 상품 코드
	String name; // 상품명
	int price; // 가격

	@Override
	public int compare(Product o1, Product o2) {

		int price1 = o1.getPrice();
		int price2 = o2.getPrice();
		String name1 = o1.getName();
		String name2 = o2.getName();

		// 1. 가격순으로 내림차순

		if (price1 > price2)
			return -1;
		if (price2 < price2)
			return 1;
		if (price == price2) {
			// 2. 이름순으로 오름차순
			int gap = name1.compareTo(name2);
			// name1이 더 크면 (사전상으로 뒤에 있는 경우)(+)
			// name1이 더 작으면 (사전상으로 앞에 있는 경우) (-)
			// name1이랑 name이 같으면 (0)
			/**if(gap > 0) return 1;
			if(gap < 0) return -1;
			if(gap == 0) return 0; */
			return gap;
		}
		return 0;
		
		/** 두번째 방법 
		int result = price2 - price1; 			→ 가격순 내림차순
		int result2 = name1.compareTo(name2);	→ 이름순 오름차순
		return result1 == 0 ? result2 : result1;
		*/
	}
}

public class ComparatorEx {
	
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
			new Product("PRD001", "과자", 4000),
			new Product("PRD002", "바지", 40000),
			new Product("PRD003", "패딩", 100000),
			new Product("PRD004", "우유", 3000),
			new Product("PRD005", "셔츠", 15000),
			new Product("PRD006", "젤리", 1000)
		);
		
		// 정렬 전
		System.out.println("정렬 전");
		for (Product product : productList) {
			System.out.println(product);
		}
		System.out.println();
		
		// 정렬
		Collections.sort(productList, new Product());
		
		// 정렬 후
		System.out.println("정렬 후");
		for (Product product : productList) {
			System.out.println(product);
		}
		System.out.println();		
	}

}
