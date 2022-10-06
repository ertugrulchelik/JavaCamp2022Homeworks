package javaKamp2022ThirdDayHomeworkThree.business;

import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.CategoryDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) {
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getname());
		}
	}

}
