package javaKamp2022ThirdDayHomeworkThree;

import java.util.ArrayList;
import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.business.CourseManager;
import javaKamp2022ThirdDayHomeworkThree.business.InstructorManager;
import javaKamp2022ThirdDayHomeworkThree.core.logging.DatabaseLogger;
import javaKamp2022ThirdDayHomeworkThree.core.logging.FileLogger;
import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.HibernateCourseDao;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.HibernateInstructorDao;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.JdbcInstructorDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Course;
import javaKamp2022ThirdDayHomeworkThree.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
		
		Course course1 = new Course(1, "Java Yazilim Gelistirici Kursu", 1500);
		Course course2 = new Course(2, ".Net Core Yazilim Gelistirici Kursu", 1300);
		Course course3 = new Course(3, "PHP Yazilim Gelistirici Kursu", 1200);

		
		
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger());
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		List<Course> courses = new ArrayList<Course>();
		
		  CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers, courses); 
		  courseManager.add(course1); 
		  courseManager.add(course2);
		  courseManager.add(course3); 
		 
	}

}
