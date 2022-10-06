package javaKamp2022ThirdDayHomeworkThree.business;

import javaKamp2022ThirdDayHomeworkThree.dataAccess.CourseDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;

	public CourseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	Course course1 = new Course (1,"Java", 5000);
	Course course2 = new Course (2,".Net", 4000);
	
	Course[] courses = {course1,course2};
	
	public void add(Course course) throws Exception {
		
		
		if(course.getUnitPrice() < 0 ) {
			throw new Exception("kurs fiyati 0'dan kucuk olamaz.");
		}
		
		for (Course course1 : courses) {
			if(course1.getName() == course.getName()) {
				throw new Exception("kurs ismi ayni olamaz!");
			}
		}
		
		courseDao.add(course);
		
	}

}
