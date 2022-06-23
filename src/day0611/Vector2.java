package day0611;

import java.util.List;
import java.util.Vector;

class Board {
	String subject;
	String content;
	String id;
	
	public Board(String subject, String content, String id) {
		this.subject = subject;
		this.content = content;
		this.id = id;
	}
}

public class Vector2 {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1", "내용1", "작성자1"));
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4", "작성자4"));
		list.add(new Board("제목5", "내용5", "작성자5"));
		
		list.remove(1);
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.subject + "\t" + b.content + "\t" + b.id);
		}
	}
}
