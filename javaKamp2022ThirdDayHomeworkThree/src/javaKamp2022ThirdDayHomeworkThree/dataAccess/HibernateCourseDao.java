package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {	
		System.out.println("Hibernate ile veritabanina eklendi: " + course.getName() );

	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
