package baseline;

public class AddStudent {

	private String studentSSN;
	private String studentName;
	private String studentAdress;
	
	public AddStudent() {	
	}
	
	public AddStudent(String studentSSN, String studentName, String studentAdress) {
		this.studentSSN = studentSSN;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
	}
	public String getStudentSSN() {
		return studentSSN;
	}
	public void setStudentSSN(String studentSSN) {
		this.studentSSN = studentSSN;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	}