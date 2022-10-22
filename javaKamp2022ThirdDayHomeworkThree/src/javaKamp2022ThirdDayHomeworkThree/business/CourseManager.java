package javaKamp2022ThirdDayHomeworkThree.business;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.CourseDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private List<Logger> loggers;
	private List<Course> courses;


	public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception {
		
		if(course.getUnitPrice() < 0 ) {
			throw new Exception("Kurs fiyati 0'dan kucuk olamaz.");
		}
		
		for (Course course_ : courses) {
			if(course.getName().equals(course_.getName())) {
				throw new Exception("Kurs isimleri tekrar edemez");
			}
		
		}
		
		courseDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
