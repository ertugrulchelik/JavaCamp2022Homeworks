package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanina eklendi: " + course.getName());		
	}

}
