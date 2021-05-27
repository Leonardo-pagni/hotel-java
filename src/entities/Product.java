package entities;

public class Product {
	private String name,email;
	
	public Product(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return getName()+", "+getEmail();
	}
}
