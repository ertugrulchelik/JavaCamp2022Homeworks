package javaKamp2022ThirdDayHomeworkThree.entities;

public class Category {
	
	private int id;
	private String name;
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
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

}
