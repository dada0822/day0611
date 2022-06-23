package day0611;

import java.util.Stack;

class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
	
}

public class Stack1 {
	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 100, 50, 500, 10
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// peek() : stack()의 맨 위에 저장된 객체를 반환
		// pop()과 달리 stack에서 객체를 꺼내지 않음!
		System.out.println(coinBox.peek().getValue());
		
		// coinBox에 있는 동전 출력하기
		while(!coinBox.empty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue());
		}

	}

}
