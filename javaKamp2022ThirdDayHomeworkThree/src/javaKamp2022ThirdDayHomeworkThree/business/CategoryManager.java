package javaKamp2022ThirdDayHomeworkThree.business;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.CategoryDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Category;
import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<Logger> loggers;
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		
		List<Category> categories = categoryDao.getAll();
		
		for (Category category2 : categories) {
			if(category.getname() == category2.getname()) {
				throw new Exception("kategori isimleri tekrar edemez");
			}
		}
		
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getname());
		}
	}

}
