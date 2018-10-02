package kk;

public class AddCourse {
		private String courseID;
		private String courseName;
		private double credit;
		
		public AddCourse() {
			
		}
		
		public AddCourse(String courseID, String courseName, double credit){
			this.courseID = courseID;
			this.courseName = courseName;
			this.credit=credit;
		}

		public String getCourseID() {
			return courseID;
		}

		public void setCourseID(String courseID) {
			this.courseID = courseID;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public double getCredit() {
			return credit;
		}

		public void setCredit(float credit) {
			this.credit = credit;
		}
		
	}