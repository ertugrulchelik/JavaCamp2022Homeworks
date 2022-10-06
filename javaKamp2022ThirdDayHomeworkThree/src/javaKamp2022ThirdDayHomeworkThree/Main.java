package javaKamp2022ThirdDayHomeworkThree;

import javaKamp2022ThirdDayHomeworkThree.business.InstructorManager;
import javaKamp2022ThirdDayHomeworkThree.core.logging.DatabaseLogger;
import javaKamp2022ThirdDayHomeworkThree.core.logging.FileLogger;
import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.JdbcInstructorDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Instructor;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
		
		Logger [] loggers = {new DatabaseLogger(), new FileLogger()};
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
	}

}
