package ClientPackage;

import java.awt.event.ActionListener;

import javax.swing.*;

public class AddCourseView extends JFrame{
	private JTextField courseName = new JTextField(10);
	private JTextField ID = new JTextField(10);
	private JTextField sectionNum = new JTextField(10);
	private JButton done = new JButton("Done");
	private JButton mainScreen = new JButton("Return to main menu");
	private JLabel title = new JLabel("Enter the Course Information");
	
	public AddCourseView() {
		super("Add course to student");
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		setSize(500, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		northPanel.add(title);
		centerPanel.add(new JLabel("Enter the name of the course:"));
		centerPanel.add(courseName);
		centerPanel.add(new JLabel("Enter the ID of the course:"));
		centerPanel.add(ID);
		centerPanel.add(new JLabel("Enter the Section Number of the course:"));
		centerPanel.add(sectionNum);
		southPanel.add(done);
		southPanel.add(mainScreen);
		add("Center", centerPanel);
		add("North", northPanel);
	}
	public String getCourseName() {
		return getStringFromTextBox(courseName);
	}
	public String getCourseID() {
		return getStringFromTextBox(ID);
	}
	public String getSectionNumner() {
		return getStringFromTextBox(sectionNum);
	}
	private String getStringFromTextBox(JTextField textField) {
		return textField.getText();
	}
	public void addDoneListener(ActionListener listenForButton) {
		done.addActionListener(listenForButton);
	}
	public void addMainScreenListener(ActionListener listenForButton) {
		mainScreen.addActionListener(listenForButton);
	}
}
