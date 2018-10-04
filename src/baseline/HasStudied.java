package baseline;

public class HasStudied {
	
	private String studentSSN;
	private String courseID;
	private String grade;
	
	
	public HasStudied(){
	}
	public HasStudied(String studentSSN, String courseID, String grade){
		this.studentSSN = studentSSN;
		this.courseID = courseID;
		this.grade = grade;
	}
	
	public String getStudentSSN() {
		return studentSSN;
	}
	public void setStudentSSN(String studentSSN) {
		this.studentSSN = studentSSN;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}

