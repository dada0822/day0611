package day0611;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exam2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i=1; i<=45; i++) {
			lotto.add(i); // 1~45까지의 숫자를 lotto에 추가
		}
		
		Collections.shuffle(lotto); // 알아서 섞어줌;;
		
		System.out.println(lotto); // 확인용
		
		int[] lottoArr = new int[6];
		
		for (int i=0; i<lottoArr.length; i++) {
			lottoArr[i] = lotto.remove(0);
		}
		
		String lottoNumStr = Arrays.toString(lottoArr);
		System.out.println("로또 번호 : " + lottoNumStr);
		
//		System.out.println(lotto); 확인용

	}

}
