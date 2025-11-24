package src.Sol;

import java.util.Scanner;

public class training {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
	
	StringBuilder result = new StringBuilder();

    // 3. 문자열의 각 문자를 순회하며 대소문자를 변환
    for (char c : a.toCharArray()) {
        
        // Character.isUpperCase() : 문자가 대문자인지 확인
        if (Character.isUpperCase(c)) {
            // 대문자일 경우, 소문자로 변환 (Character.toLowerCase())
            result.append(Character.toLowerCase(c));
            
        // Character.isLowerCase() : 문자가 소문자인지 확인
        } else if (Character.isLowerCase(c)) {
            // 소문자일 경우, 대문자로 변환 (Character.toUpperCase())
            result.append(Character.toUpperCase(c));
            
        } 
        // 참고: 문제 조건에서 str은 알파벳으로만 이루어져 있으므로 
        // else 문은 사실상 필요하지 않지만, 범용적인 코드로는 추가하는 것이 좋습니다.
    }

    // 4. 최종 변환된 문자열을 출력
    System.out.println(result.toString());
    
    sc.close();
	}
}