package day0611;

public class Member1 {
	private String name; // 필드는 public으로 잘 주지 않는다. getter/setter
	private String tel;
	private String address;
	
	public Member1() {}
	
	public Member1(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member1 [name : " + name + ", tel : " + tel + ", address : " + address + "]";
	}
	
	
	
}
