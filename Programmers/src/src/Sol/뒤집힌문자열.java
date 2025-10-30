package src.Sol;

import java.util.Stack;

// 문자열 my_string이 매개변수로 주어집니다. 
// my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
// 1 ≤ my_string의 길이 ≤ 1,000

public class 뒤집힌문자열 {
	public String solution(String my_string) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
		char[] chList = my_string.toCharArray();
		for (char ch : chList) {
			stack.push(ch);
		}
		while (!stack.isEmpty()) {
			answer += stack.pop();
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		new 뒤집힌문자열().solution("안녕하세요");
	}
}