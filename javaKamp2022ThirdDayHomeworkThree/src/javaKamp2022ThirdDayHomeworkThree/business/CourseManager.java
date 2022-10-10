package javaKamp2022ThirdDayHomeworkThree.business;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.CourseDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private List<Logger> loggers;


	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		List<Course> courses = courseDao.getAll();
		
		if(course.getUnitPrice() < 0 ) {
			throw new Exception("kurs fiyati 0'dan kucuk olamaz.");
		}
		
		for (Course course1 : courses) {
			if(course.getName() == course1.getName()) {
				throw new Exception("kurs isimleri tekrar edemez!");
			}
		}
		/*
		 * for (Course courses : courses) { if(courses.getName() == course.getName()) {
		 * throw new Exception("kurs ismi ayni olamaz!"); } }
		 */
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
