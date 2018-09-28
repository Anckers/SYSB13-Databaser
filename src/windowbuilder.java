import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;

public class windowbuilder {

	private JFrame frame;

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
		
		JLabel lblRegisterStudent = new JLabel("Registrera student");
		lblRegisterStudent.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16));
		lblRegisterStudent.setBounds(10, 11, 138, 29);
		registerStudent.add(lblRegisterStudent);
		
		JLabel lblRegisterStudentSsn = new JLabel("Personnr:");
		lblRegisterStudentSsn.setBounds(20, 45, 69, 14);
		registerStudent.add(lblRegisterStudentSsn);
		
		JPanel searchStudent = new JPanel();
		masterTabPane_1.addTab("S\u00F6k", null, searchStudent, null);
		
		JPanel deleteStudent = new JPanel();
		masterTabPane_1.addTab("Ta bort", null, deleteStudent, null);
	}
}
