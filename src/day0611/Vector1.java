package day0611;

import java.util.ArrayList;

public class Vector1 {
	public static void main(String[] args) {
		
//		Vector vc = new Vector();
		ArrayList vc = new ArrayList(); // 결과값 동일
		
		vc.add("hello");
		vc.add(new Integer(10)); // 권장하지 않는 방법!
		
		vc.add(Integer.valueOf(20));
		
		vc.add(30);
		
		System.out.println("vector size : " + vc.size());
		
		System.out.println(vc);
		for(int i=0; i<vc.size(); i++) {
			System.out.println("vc[" + i + "] : " + vc.get(i));
		}
	}

}
