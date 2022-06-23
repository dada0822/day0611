package day0611;

import java.util.ArrayList;

public class MemberMain {
	public static void main(String[] args) {
		ArrayList<Member1> data = new ArrayList<Member1>(); // Member를 저장할 거니까 제네릭 넣어줌
		MemberMenu mm = new MemberMenu();
		mm.menuProcess(data);
		
	}

}
