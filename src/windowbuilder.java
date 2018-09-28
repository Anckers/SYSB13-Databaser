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

public class windowbuilder {

	private JFrame frame;
	private JTextField txtRegisterStudentSsn;
	private JTextField txtRegisterStudentName;
	private JTextField txtRegisterStudentAdress;
	private JTextField txtAddCourseCourseCode;
	private JTextField txtAddCourseCourseName;
	private JTextField txtAddCourseDuration;

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
		tab.addTab("New tab", null, masterTabPane_1, null);
		
		JPanel registerStudent = new JPanel();
		masterTabPane_1.addTab("Registrering", null, registerStudent, null);
		registerStudent.setLayout(null);
		
		JLabel lblRegisterStudent = new JLabel("Register student");
		lblRegisterStudent.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		lblRegisterStudent.setBounds(20, 11, 138, 29);
		registerStudent.add(lblRegisterStudent);
		
		JLabel lblRegisterStudentSsn = new JLabel("Social Security nr:");
		lblRegisterStudentSsn.setBounds(45, 45, 90, 14);
		registerStudent.add(lblRegisterStudentSsn);
		
		txtRegisterStudentSsn = new JTextField();
		txtRegisterStudentSsn.setBounds(150, 45, 160, 20);
		registerStudent.add(txtRegisterStudentSsn);
		txtRegisterStudentSsn.setColumns(10);
		
		JLabel lblRegisterStudentAxterixSsn = new JLabel("*");
		lblRegisterStudentAxterixSsn.setForeground(Color.RED);
		lblRegisterStudentAxterixSsn.setBounds(25, 47, 14, 14);
		registerStudent.add(lblRegisterStudentAxterixSsn);
		
		JLabel lblRegisterStudentName = new JLabel("Name:");
		lblRegisterStudentName.setBounds(45, 70, 69, 14);
		registerStudent.add(lblRegisterStudentName);
		
		txtRegisterStudentName = new JTextField();
		txtRegisterStudentName.setColumns(10);
		txtRegisterStudentName.setBounds(150, 70, 160, 20);
		registerStudent.add(txtRegisterStudentName);
		
		JLabel lblRegisterStudentAsterixName = new JLabel("*");
		lblRegisterStudentAsterixName.setForeground(Color.RED);
		lblRegisterStudentAsterixName.setBounds(25, 72, 14, 14);
		registerStudent.add(lblRegisterStudentAsterixName);
		
		JLabel lblRegisterStudentAdress = new JLabel("Adress:");
		lblRegisterStudentAdress.setBounds(45, 97, 46, 14);
		registerStudent.add(lblRegisterStudentAdress);
		
		txtRegisterStudentAdress = new JTextField();
		txtRegisterStudentAdress.setColumns(10);
		txtRegisterStudentAdress.setBounds(150, 94, 160, 20);
		registerStudent.add(txtRegisterStudentAdress);
		
		JLabel lblRegisterStudentAsterixAdress = new JLabel("*");
		lblRegisterStudentAsterixAdress.setForeground(Color.RED);
		lblRegisterStudentAsterixAdress.setBounds(25, 100, 14, 14);
		registerStudent.add(lblRegisterStudentAsterixAdress);
		
		JButton btnRegisterStudent = new JButton("Registrera student");
		btnRegisterStudent.setBounds(150, 125, 130, 30);
		registerStudent.add(btnRegisterStudent);
		
		JLabel lblAddCourse = new JLabel("Add course");
		lblAddCourse.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAddCourse.setBounds(450, 11, 138, 29);
		registerStudent.add(lblAddCourse);
		
		JLabel lblAddCourseCourseCode = new JLabel("Course Code:");
		lblAddCourseCourseCode.setBounds(475, 45, 69, 14);
		registerStudent.add(lblAddCourseCourseCode);
		
		txtAddCourseCourseCode = new JTextField();
		txtAddCourseCourseCode.setColumns(10);
		txtAddCourseCourseCode.setBounds(580, 42, 160, 20);
		registerStudent.add(txtAddCourseCourseCode);
		
		JLabel lblAddCourseAsterixCourseCode = new JLabel("*");
		lblAddCourseAsterixCourseCode.setForeground(Color.RED);
		lblAddCourseAsterixCourseCode.setBounds(455, 45, 14, 14);
		registerStudent.add(lblAddCourseAsterixCourseCode);
		
		JLabel lblAddCourseCourseName = new JLabel("Kursnamn:");
		lblAddCourseCourseName.setBounds(475, 70, 69, 14);
		registerStudent.add(lblAddCourseCourseName);
		
		txtAddCourseCourseName = new JTextField();
		txtAddCourseCourseName.setColumns(10);
		txtAddCourseCourseName.setBounds(580, 67, 160, 20);
		registerStudent.add(txtAddCourseCourseName);
		
		JLabel lblAddCourseAsterixCourseName = new JLabel("*");
		lblAddCourseAsterixCourseName.setForeground(Color.RED);
		lblAddCourseAsterixCourseName.setBounds(455, 70, 14, 14);
		registerStudent.add(lblAddCourseAsterixCourseName);
		
		JLabel lblAddCourseDuration = new JLabel("H\u00F6gskolepo\u00E4ng:");
		lblAddCourseDuration.setBounds(475, 97, 80, 14);
		registerStudent.add(lblAddCourseDuration);
		
		JLabel lblAddCourseAsterixDuration = new JLabel("*");
		lblAddCourseAsterixDuration.setForeground(Color.RED);
		lblAddCourseAsterixDuration.setBounds(455, 97, 14, 14);
		registerStudent.add(lblAddCourseAsterixDuration);
		
		txtAddCourseDuration = new JTextField();
		txtAddCourseDuration.setColumns(10);
		txtAddCourseDuration.setBounds(580, 91, 160, 20);
		registerStudent.add(txtAddCourseDuration);
		
		JButton button = new JButton("Registrera student");
		button.setBounds(580, 125, 130, 30);
		registerStudent.add(button);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 215, 1280, 10);
		registerStudent.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(396, 0, 8, 215);
		registerStudent.add(separator_1);
		
		JPanel searchStudent = new JPanel();
		masterTabPane_1.addTab("S\u00F6k", null, searchStudent, null);
		
		JPanel deleteStudent = new JPanel();
		masterTabPane_1.addTab("Ta bort", null, deleteStudent, null);
	}
}
