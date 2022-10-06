package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import javaKamp2022ThirdDayHomeworkThree.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanina eklendi: " + category.getname());		
		
	}

}
