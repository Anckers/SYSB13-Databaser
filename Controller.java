package kk;

import java.sql.SQLException;

public class Controller {
	
	private DAL dal;
	
	public Controller() {
		dal = new DAL();
	}
		// ADD
		public void addStudentDal(String studentSSN, String studentName, String studentAdress) throws SQLException {
			DAL dal = new DAL();
			AddStudent student= new AddStudent();
			student.setStudentName(studentName);
			student.setStudentSSN(studentSSN);
			student.setStudentAdress(studentAdress);
			dal.addStudent(student);
			
	}
		public void addCourseDal(String courseID, String courseName, float credit) throws SQLException {
			DAL dal = new DAL();
			AddCourse course = new AddCourse();
			course.setCourseID(courseID);
			course.setCourseName(courseName);
			course.setCredit(credit);
			dal.addCourse(course);
		}
}
	


