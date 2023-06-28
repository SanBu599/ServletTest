package sample5;

public class Human {
	
	private String name;
	private int age;
	private String address;
	
	public Human() {
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Human(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
}
