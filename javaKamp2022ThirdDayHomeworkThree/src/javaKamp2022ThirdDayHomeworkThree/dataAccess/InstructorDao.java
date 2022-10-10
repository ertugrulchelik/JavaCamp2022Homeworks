package javaKamp2022ThirdDayHomeworkThree.dataAccess;

import java.util.List;

import javaKamp2022ThirdDayHomeworkThree.entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	List<Instructor> getAll();
}
