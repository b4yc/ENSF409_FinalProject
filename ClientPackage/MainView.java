package ClientPackage;

import java.awt.event.ActionListener;

import javax.swing.*;

public class MainView extends JFrame{
	private JButton search = new JButton("Search Course Catalogues");
	private JButton addCourse = new JButton("Add Course to Student Courses");
	private JButton remove = new JButton("Remove Course From Student Courses");
	private JButton courseCatalogue = new JButton("View all Courses in the Catalogue");
	private JButton studentCourses = new JButton("View all Courses Taken by the Student");
	private JButton quit = new JButton("Quit");
	private JLabel title = new JLabel("Please Choose from one of the Following Options");
	private JTextArea text = new JTextArea(10, 10);
	
	public MainView() {
		super("Main Menu");
		setSize(500, 500);
		text.setEditable(false);
		JPanel southPanel = new JPanel();
		JScrollPane centerPanel = new JScrollPane(text);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		southPanel.add(search);
		southPanel.add(addCourse);
		southPanel.add(remove);
		southPanel.add(courseCatalogue);
		southPanel.add(studentCourses);
		southPanel.add(quit);
		add("South", southPanel);
		add("Center", centerPanel);
	}
	public void addSearchListener(ActionListener listenForButton) {
		search.addActionListener(listenForButton);
	}
	public void addCourseListener(ActionListener listenForButton) {
		addCourse.addActionListener(listenForButton);
	}
	public void addRemoveListener(ActionListener listenForButton) {
		remove.addActionListener(listenForButton);
	}
	public void addCourseCatalogueListener(ActionListener listenForButton) {
		courseCatalogue.addActionListener(listenForButton);
	}
	public void addQuitListener(ActionListener listenForButton) {
		quit.addActionListener(listenForButton);
	}
	public void addStudentCourseListener(ActionListener listenForButton) {
		studentCourses.addActionListener(listenForButton);
	}
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
	public void addText(String data) {
		text.setText(data);
	}
}
