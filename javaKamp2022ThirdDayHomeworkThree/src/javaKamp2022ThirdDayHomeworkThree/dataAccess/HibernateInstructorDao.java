package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import javaKamp2022ThirdDayHomeworkThree.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanina eklendi:" + instructor.getFirstName());

	}

}
