import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class windowbuilder {

	private JFrame frame;
	private JTextField txtRegisterStudentSsn;
	private JTextField txtRegisterStudentName;
	private JTextField txtRegisterStudentAdress;
	private JTextField txtAddCourseCode;
	private JTextField txtAddCourseName;
	private JTextField txtAddCourseCredit;
	private JTextField txtRegisterStudentToCourseSsn;
	private JTextField txtRegisterStudentToCourseSemester;
	private JTable tableCoursesHeader;
	private JTextField txtSearchCourseCode;
	private JTextField txtSearchStudentSsn;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowbuilder window = new windowbuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowbuilder() {
		initialize();
	}
//ANAS
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tab, BorderLayout.CENTER);
		
		JTabbedPane masterTabPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tab.addTab("Assignment 1", null, masterTabPane_1, "Working Title");
		
		JPanel register = new JPanel();
		masterTabPane_1.addTab("Register", null, register, null);
		
		JLabel lblRegisterStudent = new JLabel("Register student");
		lblRegisterStudent.setBounds(20, 11, 138, 29);
		lblRegisterStudent.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		
		JLabel lblRegisterStudentSsn = new JLabel("Social Security nr:");
		lblRegisterStudentSsn.setBounds(45, 45, 120, 14);
		
		txtRegisterStudentSsn = new JTextField();
		txtRegisterStudentSsn.setBounds(177, 45, 160, 20);
		txtRegisterStudentSsn.setColumns(10);
		
		JLabel lblRegisterStudentAxterixSsn = new JLabel("*");
		lblRegisterStudentAxterixSsn.setBounds(25, 47, 14, 14);
		lblRegisterStudentAxterixSsn.setForeground(Color.RED);
		
		JLabel lblRegisterStudentName = new JLabel("Name:");
		lblRegisterStudentName.setBounds(45, 70, 69, 14);
		
		txtRegisterStudentName = new JTextField();
		txtRegisterStudentName.setBounds(177, 70, 160, 20);
		txtRegisterStudentName.setColumns(10);
		
		JLabel lblRegisterStudentAsterixName = new JLabel("*");
		lblRegisterStudentAsterixName.setBounds(25, 72, 14, 14);
		lblRegisterStudentAsterixName.setForeground(Color.RED);
		
		JLabel lblRegisterStudentAdress = new JLabel("Adress:");
		lblRegisterStudentAdress.setBounds(45, 97, 46, 14);
		
		txtRegisterStudentAdress = new JTextField();
		txtRegisterStudentAdress.setBounds(177, 94, 160, 20);
		txtRegisterStudentAdress.setColumns(10);
		
		JLabel lblRegisterStudentAsterixAdress = new JLabel("*");
		lblRegisterStudentAsterixAdress.setBounds(25, 100, 14, 14);
		lblRegisterStudentAsterixAdress.setForeground(Color.RED);
		
		JButton btnRegisterStudent = new JButton("Register student");
		btnRegisterStudent.setBounds(177, 127, 130, 30);
		
		JLabel lblAddCourse = new JLabel("Add course");
		lblAddCourse.setBounds(450, 11, 138, 29);
		lblAddCourse.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		
		JLabel lblAddCourseCode = new JLabel("Course Code:");
		lblAddCourseCode.setBounds(475, 45, 87, 14);
		
		txtAddCourseCode = new JTextField();
		txtAddCourseCode.setBounds(580, 41, 160, 20);
		txtAddCourseCode.setColumns(10);
		
		JLabel lblAddCourseAsterixCode = new JLabel("*");
		lblAddCourseAsterixCode.setBounds(455, 45, 14, 14);
		lblAddCourseAsterixCode.setForeground(Color.RED);
		
		JLabel lblAddCourseName = new JLabel("Course Name:");
		lblAddCourseName.setBounds(475, 70, 93, 14);
		
		txtAddCourseName = new JTextField();
		txtAddCourseName.setBounds(580, 66, 160, 20);
		txtAddCourseName.setColumns(10);
		
		JLabel lblAddCourseAsterixName = new JLabel("*");
		lblAddCourseAsterixName.setBounds(455, 70, 14, 14);
		lblAddCourseAsterixName.setForeground(Color.RED);
		
		JLabel lblAddCourseCredit = new JLabel("Course credit:");
		lblAddCourseCredit.setBounds(476, 97, 92, 14);
		
		JLabel lblAddCourseAsterixCredit = new JLabel("*");
		lblAddCourseAsterixCredit.setBounds(455, 100, 14, 14);
		lblAddCourseAsterixCredit.setForeground(Color.RED);
		
		txtAddCourseCredit = new JTextField();
		txtAddCourseCredit.setBounds(580, 93, 160, 20);
		txtAddCourseCredit.setColumns(10);
		
		JButton btnRegisterCourse = new JButton("Register Course");
		btnRegisterCourse.setBounds(580, 127, 130, 30);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 215, 1280, 10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(396, 0, 8, 215);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		register.setLayout(null);
		register.add(lblRegisterStudent);
		register.add(lblRegisterStudentAxterixSsn);
		register.add(txtRegisterStudentSsn);
		register.add(lblRegisterStudentSsn);
		register.add(lblRegisterStudentAsterixName);
		register.add(lblRegisterStudentName);
		register.add(txtRegisterStudentName);
		register.add(lblRegisterStudentAsterixAdress);
		register.add(lblRegisterStudentAdress);
		register.add(btnRegisterStudent);
		register.add(txtRegisterStudentAdress);
		register.add(separator_1);
		register.add(lblAddCourse);
		register.add(lblAddCourseAsterixCode);
		register.add(lblAddCourseCode);
		register.add(txtAddCourseCode);
		register.add(lblAddCourseAsterixCredit);
		register.add(lblAddCourseCredit);
		register.add(txtAddCourseCredit);
		register.add(lblAddCourseAsterixName);
		register.add(btnRegisterCourse);
		register.add(lblAddCourseName);
		register.add(txtAddCourseName);
		register.add(separator);
		
		JLabel lblRegisterStudentTo = new JLabel("Register student to course");
		lblRegisterStudentTo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		lblRegisterStudentTo.setBounds(20, 238, 181, 29);
		register.add(lblRegisterStudentTo);
		
		JLabel lblRegisterStudentToCourseSsn = new JLabel("Social Security nr:");
		lblRegisterStudentToCourseSsn.setBounds(40, 272, 120, 14);
		register.add(lblRegisterStudentToCourseSsn);
		
		JLabel lblRegisterStudentToCourseAsterix = new JLabel("*");
		lblRegisterStudentToCourseAsterix.setForeground(Color.RED);
		lblRegisterStudentToCourseAsterix.setBounds(20, 275, 14, 14);
		register.add(lblRegisterStudentToCourseAsterix);
		
		JLabel lblRegisterStudentToCourseSemester = new JLabel("Semester:");
		lblRegisterStudentToCourseSemester.setBounds(40, 297, 120, 14);
		register.add(lblRegisterStudentToCourseSemester);
		
		JLabel lblRegisterStudentToCourseSemesterAsterix = new JLabel("*");
		lblRegisterStudentToCourseSemesterAsterix.setForeground(Color.RED);
		lblRegisterStudentToCourseSemesterAsterix.setBounds(20, 300, 14, 14);
		register.add(lblRegisterStudentToCourseSemesterAsterix);
		
		JLabel lblRegisterStudentToCourseState = new JLabel("State:");
		lblRegisterStudentToCourseState.setBounds(40, 324, 120, 14);
		register.add(lblRegisterStudentToCourseState);
		
		JLabel lblRegisterStudentToCourseStateAterix = new JLabel("*");
		lblRegisterStudentToCourseStateAterix.setForeground(Color.RED);
		lblRegisterStudentToCourseStateAterix.setBounds(20, 327, 14, 14);
		register.add(lblRegisterStudentToCourseStateAterix);
		
		JLabel lblRegisterStudentToCourseGrade = new JLabel("Grade:");
		lblRegisterStudentToCourseGrade.setBounds(40, 353, 120, 14);
		register.add(lblRegisterStudentToCourseGrade);
		
		JLabel lblRegisterStudentToCourseGradeAsterix = new JLabel("*");
		lblRegisterStudentToCourseGradeAsterix.setForeground(Color.RED);
		lblRegisterStudentToCourseGradeAsterix.setBounds(20, 356, 14, 14);
		register.add(lblRegisterStudentToCourseGradeAsterix);
		
		txtRegisterStudentToCourseSsn = new JTextField();
		txtRegisterStudentToCourseSsn.setColumns(10);
		txtRegisterStudentToCourseSsn.setBounds(209, 268, 160, 20);
		register.add(txtRegisterStudentToCourseSsn);
		
		txtRegisterStudentToCourseSemester = new JTextField();
		txtRegisterStudentToCourseSemester.setColumns(10);
		txtRegisterStudentToCourseSemester.setBounds(209, 293, 160, 20);
		register.add(txtRegisterStudentToCourseSemester);
		
		JComboBox comboBoxRegisterStudentToCourseState = new JComboBox();
		comboBoxRegisterStudentToCourseState.setBounds(209, 320, 160, 22);
		register.add(comboBoxRegisterStudentToCourseState);
		
		JComboBox comboBoxRegisterStudentToCourseGrade = new JComboBox();
		comboBoxRegisterStudentToCourseGrade.setBounds(209, 353, 160, 22);
		register.add(comboBoxRegisterStudentToCourseGrade);
		
		JButton btnRegsterStudentToCourseGetCourses = new JButton("Get courses");
		btnRegsterStudentToCourseGetCourses.setBounds(396, 267, 105, 25);
		register.add(btnRegsterStudentToCourseGetCourses);
		
		JButton btnRegisterStudentToCourseRegister = new JButton("Register");
		btnRegisterStudentToCourseRegister.setBounds(210, 388, 97, 25);
		register.add(btnRegisterStudentToCourseRegister);
		
		JScrollPane scrollPaneCourses = new JScrollPane();
		scrollPaneCourses.setBounds(519, 238, 502, 362);
		register.add(scrollPaneCourses);
		
		tableCoursesHeader = new JTable();
		tableCoursesHeader.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPaneCourses.setColumnHeaderView(tableCoursesHeader);
		
		JPanel search = new JPanel();
		masterTabPane_1.addTab("Search", null, search, null);
		search.setLayout(null);
		
		JLabel lblSearchCourseCode = new JLabel("Course code:");
		lblSearchCourseCode.setBounds(20, 15, 76, 16);
		search.add(lblSearchCourseCode);
		
		JLabel lblSearchStudentSsn = new JLabel("Student ssn:");
		lblSearchStudentSsn.setBounds(20, 45, 72, 16);
		search.add(lblSearchStudentSsn);
		
		txtSearchCourseCode = new JTextField();
		txtSearchCourseCode.setBounds(120, 12, 183, 22);
		search.add(txtSearchCourseCode);
		txtSearchCourseCode.setColumns(10);
		
		txtSearchStudentSsn = new JTextField();
		txtSearchStudentSsn.setColumns(10);
		txtSearchStudentSsn.setBounds(120, 42, 183, 22);
		search.add(txtSearchStudentSsn);
		
		table = new JTable();
		table.setBounds(364, 15, 833, 563);
		search.add(table);
		
		JButton btnSearchShowResultsForCourse = new JButton("Show results for course");
		btnSearchShowResultsForCourse.setBounds(120, 76, 183, 25);
		search.add(btnSearchShowResultsForCourse);
		
		JButton btnSearchStudentInformation = new JButton("Student information");
		btnSearchStudentInformation.setBounds(120, 103, 183, 25);
		search.add(btnSearchStudentInformation);
		
		JButton btnSearchStudentInfoForCourse = new JButton("Student info for course");
		btnSearchStudentInfoForCourse.setBounds(120, 130, 183, 25);
		search.add(btnSearchStudentInfoForCourse);
	}
}
