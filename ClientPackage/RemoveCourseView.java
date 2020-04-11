package ClientPackage;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RemoveCourseView extends JFrame{
	private JTextField courseName = new JTextField(10);
	private JTextField ID = new JTextField(10);
	private JButton remove = new JButton("Remove");
	private JButton mainScreen = new JButton("Return to main menu");
	private JLabel title = new JLabel("Enter the Course Information");
	
	public RemoveCourseView() {
		super("Remove course to student");
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
		southPanel.add(remove);
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
	private String getStringFromTextBox(JTextField textField) {
		return textField.getText();
	}
	public void addRemoveListener(ActionListener listenForButton) {
		remove.addActionListener(listenForButton);
	}
	public void addMainScreenListener(ActionListener listenForButton) {
		mainScreen.addActionListener(listenForButton);
	}
}
