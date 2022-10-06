package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import javaKamp2022ThirdDayHomeworkThree.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanina eklendi:" + instructor.getFirstName());
	}

}
