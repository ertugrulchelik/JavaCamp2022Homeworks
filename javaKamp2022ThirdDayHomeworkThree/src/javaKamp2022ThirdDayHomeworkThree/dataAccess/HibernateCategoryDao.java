package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanina eklendi: " + category.getname());		
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
