package javaKamp2022ThirdDayHomeworkThree.business;

import javaKamp2022ThirdDayHomeworkThree.core.logging.Logger;
import javaKamp2022ThirdDayHomeworkThree.dataAccess.InstructorDao;
import javaKamp2022ThirdDayHomeworkThree.entities.Instructor;

public class InstructorManager{

	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}

}
