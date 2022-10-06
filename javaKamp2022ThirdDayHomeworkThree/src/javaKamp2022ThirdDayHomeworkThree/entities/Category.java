package javaKamp2022ThirdDayHomeworkThree.entities;

public class Category {
	
	private int id;
	private String name;
	
	public Category() {
		
	}
	
	public Category(int id, String categoryName) {
		this.id = id;
		this.name = categoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setCategoryName(String name) {
		this.name = name;
	}

}
