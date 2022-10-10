package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanina eklendi: " + category.getname());		
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
