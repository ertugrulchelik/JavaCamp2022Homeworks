package javaKamp2022ThirdDayHomeworkThree.business;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.CategoryDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Category;
import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<Logger> loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for (Category category_ : categories) {
			if(category.getname().equals(category_.getname())) {
				throw new Exception("Kategori ismi ayni olamaz");
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getname());
		}
	}

}
