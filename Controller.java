package kk;

import java.util.*;
import java.sql.SQLException;

public class Controller {
	
	private DAL dal;
	
	public Controller() {
		dal = new DAL();
	}
		// ADD
		public void addStudentDal(String studentSSN, String studentName, String studentAdress) throws SQLException {
			AddStudent student= new AddStudent();
			student.setStudentName(studentName);
			student.setStudentSSN(studentSSN);
			student.setStudentAdress(studentAdress);
			dal.addStudent(student);
			
	}
		public void addCourseDal(String courseID, String courseName) throws SQLException {
			AddCourse course = new AddCourse();
			course.setCourseID(courseID);
			course.setCourseName(courseName);
			dal.addCourse(course);
		}
		public void registerOldStudentDal (String studentSSN, String courseID, String grade) throws SQLException {
			HasStudied oldstudent = new HasStudied();
			oldstudent.setStudentSSN(studentSSN);
			oldstudent.setCourseID(courseID);
			oldstudent.setGrade(grade);
			dal.RegisterOldStudent(oldstudent);
		}
		public void registerNewStudent (String studentSSN, String courseID) throws SQLException {
			Studies newstudent = new Studies();
			newstudent.setStudentSSN(studentSSN);
			newstudent.setCourseID(courseID);
			dal.RegisterNewStudent(newstudent);
		}
		// FIND
		public void findStudentDal(String studentSSN) throws SQLException {
			dal.findStudent(studentSSN);	
		}
		public void findCourseDal(String courseID) throws SQLException {
			dal.findCourse(courseID);
		}
		public HasStudied findResultFromCourse(String studentSSN, String courseID) throws SQLException {
			return dal.findResultFromCourse(studentSSN, courseID);
		}
		public ArrayList<HasStudied> getAllStudentsResultsFromCourse(String courseID) throws SQLException {
			return dal.getAllStudentsResultsFromCourse(courseID);
		}	
}
	


