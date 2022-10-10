package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.entities.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
}
