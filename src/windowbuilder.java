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

public class windowbuilder {

	private JFrame frame;
	private JTextField txtRegisterStudentSsn;
	private JTextField txtRegisterStudentName;
	private JTextField txtRegisterStudentAdress;
	private JTextField txtAddCourseCode;
	private JTextField txtAddCourseName;
	private JTextField txtAddCourseCredit;

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
		
		JPanel search = new JPanel();
		masterTabPane_1.addTab("Search", null, search, null);
		
		JPanel delete = new JPanel();
		masterTabPane_1.addTab("Delete", null, delete, null);
	}
}
