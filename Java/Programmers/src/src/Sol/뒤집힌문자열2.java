package src.Sol;

import java.util.Stack;

// 뒤집힌문자열 거꾸로 돌리기
// 배열을 사용하여 (foreach)

public class 뒤집힌문자열2 {
	
	String solution(String my_string) {
	    String answer = "";
	    Stack<Character> stack = new Stack<Character>();
	    
	    char[] chList = my_string.toCharArray();

	    for (char ch : chList){
	        stack.push(ch);
	    }

	    while(stack.empty() == false ){
	        char solution = stack.pop();
	        stack.pop();
	        answer += solution;
	    }
	    System.out.println(answer);
	    return answer;
	}
	
	public static void main(String[] args) {
		new 뒤집힌문자열().solution("메리 크리스마스");
	}
	
}
