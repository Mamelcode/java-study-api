package data;

public class Weapon {
	String id;
	String name;
	int price;
	boolean repairable;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public boolean isRepairable() {
		return repairable;
	}
	public void setRepairable(boolean repairable) {
		this.repairable = repairable;
	}
}
