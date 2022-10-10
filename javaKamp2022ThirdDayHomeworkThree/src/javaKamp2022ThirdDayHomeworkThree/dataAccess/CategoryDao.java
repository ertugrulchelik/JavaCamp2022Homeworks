package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();
}
