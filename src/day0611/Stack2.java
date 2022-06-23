package day0611;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack2 {
	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "((2*3)+1+2))";
		
		System.out.println("검사식 : " + expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch);
				} else if(ch == ')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("닫는 괄호가 부족합니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("여는 괄호가 부족합니다.");
		}
		
	}
}
