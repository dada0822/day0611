package day0611;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
	
		
		startTime = System.currentTimeMillis();
		
		// ArrayList
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); // 0번에다가 넣겠다는 뜻 하나씩 점점 뒤로 밀려남
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("ArrayList 소요시간 : " + (endTime - startTime) + "ms");
		
		
		// LinkedList
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("LinkedList 소요시간 : " + (endTime - startTime) + "ms");
		
		// 구분			순차적으로		중간에		검색
		//				추가/삭제		추가/삭제		
		// ArryList		빠름			느림			빠름(연속적인 공간에 저장하기 때문에)
		// LinkedList	느림			빠름			느림(불연속적인~)
	}

}
