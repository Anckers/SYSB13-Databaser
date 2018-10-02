package kk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	
public class DAL {
	
	private ResultSet rs;
			
			public void addStudent(AddStudent student) throws SQLException {
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				
				try{
					PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Student (studentSSN, studentName, studentAdress) VALUES (?,?,?)");
					pstmt.setString(1, student.getStudentSSN());
					pstmt.setString(2, student.getStudentName());
					pstmt.setString(3, student.getStudentAdress());
					pstmt.executeUpdate();
				}catch(Exception ex){
					ex.printStackTrace();
				}
				connection.close();
			}
			public void addCourse(AddCourse course) throws SQLException {
				
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
			
				try{
					PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Course (courseID, courseName, credit) VALUES (?,?,?)");
					pstmt.setString(1, course.getCourseID());
					pstmt.setString(2, course.getCourseName());
					pstmt.setDouble(3, course.getCredit());
					pstmt.executeUpdate();
				}catch(Exception ex){
					ex.printStackTrace();
				}
				connection.close();
			}
			public void RegisterOldStudent(HasStudied studied) throws SQLException {
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				
				try{
					PreparedStatement pstmt = connection.prepareStatement("INSERT INTO HasStudied VALUES (?, ?, ?");
					pstmt.setString(1, studied.getStudentSSN());
					pstmt.setString(2, studied.getCourseID());
					pstmt.setString(3, studied.getGrade());
					pstmt.executeUpdate();
				}catch(Exception ex){
					ex.printStackTrace();	
				}
				connection.close();
			}
			public void RegisterNewStudent(Studies studies) throws SQLException {
				
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				
				try{
					PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Studies VALUES (?, ?");
					pstmt.setString(1, studies.getStudentSSN());
					pstmt.setString(2, studies.getCourseID());
					pstmt.executeUpdate();
				}catch(Exception ex){
					ex.printStackTrace();
				}
				connection.close();
			}
			public AddStudent findStudent(String queryA) throws SQLException{

				rs = null;
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				
				AddStudent s = new AddStudent();
				try{
					PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM Student WHERE studentSSN=?");
					pstmt.setString(1, queryA);
					rs = pstmt.executeQuery();
					if (rs.next()){
						s = new AddStudent(rs.getString("studentSSN"), rs.getString("studentName"), rs.getString("studentAdress"));
					}
					pstmt.close();
				}catch(Exception ex){
					ex.printStackTrace();
				}
				return s;
			}
			public AddCourse findCourse(String queryA) throws SQLException {
				
				rs = null;
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				
				AddCourse c = new AddCourse();
				try{
					PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM Course WHERE courseID=?");
					pstmt.setString(1, queryA);
					rs = pstmt.executeQuery();
					if (rs.next()){
						c = new AddCourse(rs.getString("courseID"),rs.getString("courseName"),rs.getDouble("credit"));
					}
				}catch(Exception ex){
					ex.printStackTrace();
				}
				return c;
			}
			public Studies findCurrentStudent(String studentSSN, String courseID) throws SQLException {
				
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				rs = null;
				Studies cs = new Studies();
					
				try {
						PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM Studies WHERE studentSSN=? AND courseID=?");
						pstmt.setString(1, cs.getStudentSSN());
						pstmt.setString(2, cs.getCourseID());
						rs = pstmt.executeQuery();
						if (rs.next()) {
							cs = new Studies(rs.getString("studentSSN"), rs.getString("courseID"));
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					return cs;
			}
			public HasStudied findOldStudent(String studentSSN, String courseID) throws SQLException{

				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				rs = null;
				HasStudied hs = new HasStudied();
				
				try{
					PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM HasStudied WHERE studentSSN=? and courseID=?");
					pstmt.setString(1, hs.getStudentSSN());
					pstmt.setString(2, hs.getCourseID());
					rs = pstmt.executeQuery();
					if (rs.next()){
						hs = new HasStudied(rs.getString("studentSSN"), rs.getString("courseID"), rs.getString("grade"));	
					}
				} catch(Exception ex){
					ex.printStackTrace();
				}
				return hs;
				}
			//Find Lists

			public HasStudied findGradesHasStudied(String courseID) throws SQLException {
				
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				rs = null;
				HasStudied stl = new HasStudied();
				
				try{
					PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM HasStudied WHERE courseID=?");
					pstmt.setString(1, stl.getCourseID());
					rs = pstmt.executeQuery();
					if (rs.next()){
						stl = new HasStudied(rs.getString("studentSSN"), rs.getString("courseID"), rs.getString("grade") );
							}
						}catch(Exception ex){
							ex.printStackTrace();
						}
							return stl;
					}
			// DELETE
			public void deleteStudent(AddStudent studentSSN) throws SQLException {
				
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				AddStudent a = studentSSN;
				
				try {
				PreparedStatement pstmt = connection.prepareStatement("DELETE FROM Student WHERE studentSSN =?");
				pstmt.setString(1, a.getStudentSSN());
				pstmt.executeUpdate();
				pstmt.close();
			}catch(Exception ed) {
				ed.printStackTrace();
			}
			}
			public void deleteCourse(AddCourse courseID) {
				
				ConnectionFac connect = new ConnectionFac();
				Connection connection = connect.startConnection();
				AddCourse c = courseID;
				
				try {
					PreparedStatement pstmt = connection.prepareStatement("DELETE FROM Course WHERE courseID =?");
					pstmt.setString(1, c.getCourseID());
					pstmt.executeUpdate();
					pstmt.close();
				}catch(Exception ed) {
					ed.printStackTrace();
				}
			}
}
