package Entities;



public class Game {
	
	public Game( int id, String name, String category , String price) {
		this.setId(id);
		this.setName(name);
		this.setCategory(category);
		this.setPrice(price);
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	private int id;
	private String name;
	private String category;
	private String price;
}

