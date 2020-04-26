package test.RedBag;

public class User {
	
	private String name;
	private int money;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void show() {
		System.out.println("用户：" + name + "余额：" + money);
	}
}
