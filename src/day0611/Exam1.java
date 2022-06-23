package day0611;

import java.util.ArrayList;

class Item {
	private String name;
	private int price;
	
	public Item() {}
	
	public Item(String _name, int _price) {
		name = _name;
		price = _price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String print() {
		return String.format("Item [ name : %s, price : %d ]", name, price);
	}
	
	@Override
	public String toString() {
		return "Item { name : " + name + ", price : " + price + " }";
	}
}

public class Exam1 {
	
	public static void main(String[] args) {
		/* Item 객체(이름, 가격)를 생성하고 이를 이용하여 장바구니 만들기
		 * 장바구니 품목
		 * 이름		가격
		 * 티셔츠		49900
		 * 면바지		58900
		 * 스니커즈	46900
		 * 
		 * 출력 결과
		 * Item { name : 스프라이트 셔츠, price : 49900 }
		 * Item { name : 슬림 면바지, price : 58900 }
		 * Item { name : 스니커즈, price : 46900 }
		 * =========================================
		 * 총합 : 155700원 */
		
		// Item 객체 생성하여 값 저장하기
		Item tshirt = new Item("스프라이트 셔츠", 49900);
		Item pants = new Item("슬림 면바지", 58900);
		Item sneakers = new Item("스니커즈", 46900);
		
		// ArrayList를 생성하고 Item의 내용을 담기
		ArrayList<Item> cart = new ArrayList<Item>();
		cart.add(0, tshirt); // 내용 추가! add
		cart.add(1, pants);
		cart.add(2, sneakers);
		
		// 합계 및 출력하기
		
		int sum = 0;
		
		for (int i=0; i<cart.size(); i++) {
			Item item = cart.get(i);
			System.out.println(item.print());
//			System.out.println(item.toString());
			sum +=item.getPrice();
		}
		
		System.out.println("==================================");
		System.out.printf("총 합계 : %d원", sum);
		
		// 나
//		for (int i=0; i<cart.size(); i++) {
//			System.out.println(cart.get(i));
//		}
//		
//		sumTotal(cart);

	}
	
	//나
//	static void sumTotal(ArrayList<Item> cart) {
//		int sum = 0;
//		for(int i=0; i<cart.size(); i++) {
//			sum += cart.get(i).getPrice();
//		}
//		System.out.println("==================================");
//		System.out.println("총합 : " + sum + "원");
//	}

}
