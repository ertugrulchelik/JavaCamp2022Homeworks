package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import javaKamp2022ThirdDayHomeworkThree.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanina eklendi: " + category.getname());		
		
	}

}
