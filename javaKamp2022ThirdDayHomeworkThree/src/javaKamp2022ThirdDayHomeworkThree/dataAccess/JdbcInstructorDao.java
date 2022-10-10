package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanina eklendi:" + instructor.getFirstName());
	}

	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
