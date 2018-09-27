
public class UserInterface {

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JTabbedPane;
	import javax.swing.GroupLayout;
	import javax.swing.GroupLayout.Alignment;
	import javax.swing.JLayeredPane;
	import javax.swing.AbstractAction;
	import javax.swing.Action;
	import javax.swing.ButtonGroup;
	import javax.swing.JPanel;
	import java.awt.BorderLayout;
	import javax.swing.JTextField;
	import javax.swing.JLabel;
	import javax.swing.JTextPane;
	import javax.swing.JCheckBox;

	public class ApplicationWindow {

		private JFrame frame;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ApplicationWindow window = new ApplicationWindow();
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
		public ApplicationWindow() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 743, 463);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 23, 727, 417);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JButton btnAddStudent = new JButton("Add Student");
			btnAddStudent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnAddStudent.setBounds(10, 54, 127, 23);
			panel.add(btnAddStudent);
			
			JButton btnAddCourse = new JButton("Add Course");
			btnAddCourse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAddCourse.setBounds(10, 138, 127, 23);
			panel.add(btnAddCourse);
			
			textField = new JTextField();
			textField.setBounds(10, 23, 127, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(167, 23, 127, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(328, 23, 127, 20);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblName = new JLabel("Name");
			lblName.setBounds(167, 11, 46, 14);
			panel.add(lblName);
			
			JLabel lblAdress = new JLabel("Adress");
			lblAdress.setBounds(328, 11, 46, 14);
			panel.add(lblAdress);
			
			JLabel lblSocialsecuritynumber = new JLabel("SocialSecurityNumber");
			lblSocialsecuritynumber.setBounds(10, 11, 114, 14);
			panel.add(lblSocialsecuritynumber);
			
			textField_3 = new JTextField();
			textField_3.setBounds(10, 102, 127, 20);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(167, 102, 127, 20);
			panel.add(textField_4);
			
			JLabel lblCourseid = new JLabel("CourseID");
			lblCourseid.setBounds(10, 88, 46, 14);
			panel.add(lblCourseid);
			
			JLabel lblCoursename = new JLabel("CourseName");
			lblCoursename.setBounds(167, 89, 87, 14);
			panel.add(lblCoursename);
			
			JButton btnSearchStudent = new JButton("Search Student");
			btnSearchStudent.setBounds(167, 54, 129, 23);
			panel.add(btnSearchStudent);
			
			JButton btnSearchCourse = new JButton("Search Course");
			btnSearchCourse.setBounds(167, 138, 129, 23);
			panel.add(btnSearchCourse);
			
			JTextPane txtpnInfobox = new JTextPane();
			txtpnInfobox.setText("infobox");
			txtpnInfobox.setBounds(10, 170, 285, 184);
			panel.add(txtpnInfobox);
			
			JButton btnRegisterStudentOn = new JButton("Register Student on Course");
			btnRegisterStudentOn.setBounds(305, 329, 177, 23);
			panel.add(btnRegisterStudentOn);
			
			textField_5 = new JTextField();
			textField_5.setBounds(305, 217, 120, 20);
			panel.add(textField_5);
			textField_5.setColumns(10);
			
			JLabel lblSocialsecuritynumber_1 = new JLabel("SocialSecurityNumber");
			lblSocialsecuritynumber_1.setBounds(305, 204, 120, 14);
			panel.add(lblSocialsecuritynumber_1);
			
			textField_6 = new JTextField();
			textField_6.setBounds(305, 258, 86, 20);
			panel.add(textField_6);
			textField_6.setColumns(10);
			
			JLabel lblCourseid_1 = new JLabel("CourseID");
			lblCourseid_1.setBounds(305, 244, 46, 14);
			panel.add(lblCourseid_1);
			
			JCheckBox chckbx = new JCheckBox("");
			chckbx.setBounds(436, 255, 28, 23);
			panel.add(chckbx);
			
			JLabel lblIsTheCourse = new JLabel("Is the Course finished?");
			lblIsTheCourse.setBounds(390, 244, 114, 14);
			panel.add(lblIsTheCourse);
			
			textField_7 = new JTextField();
			textField_7.setBounds(396, 298, 86, 20);
			panel.add(textField_7);
			textField_7.setColumns(10);
			
			JLabel lblGrade = new JLabel("Grade");
			lblGrade.setBounds(395, 285, 46, 14);
			panel.add(lblGrade);
			
			JButton btnDeleteStudent = new JButton("Delete Student");
			btnDeleteStudent.setBounds(328, 54, 127, 23);
			panel.add(btnDeleteStudent);
			
			JButton btnDeleteCourse = new JButton("Delete Course");
			btnDeleteCourse.setBounds(328, 138, 127, 23);
			panel.add(btnDeleteCourse);
			
			JButton btnUppgift2 = new JButton("U2");
			btnUppgift2.setBounds(203, 0, 89, 23);
			frame.getContentPane().add(btnUppgift2);
			
			JButton btnUppgift3 = new JButton("U3");
			btnUppgift3.setBounds(415, 0, 89, 23);
			frame.getContentPane().add(btnUppgift3);
			
			JButton btnUppgift1 = new JButton("U1");
			btnUppgift1.setBounds(0, 0, 89, 23);
			frame.getContentPane().add(btnUppgift1);
		}
	}

