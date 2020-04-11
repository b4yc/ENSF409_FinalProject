package ClientPackage;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

//handles socket in and out and writes to GUI
public class GUIController extends JFrame {
	
	MainView mainView = new MainView();
	
	public GUIController(MainView m)	{
		mainView = m;
		mainView.addSearchListener(ActionListener listenForButton);
		mainView.addCourseListener(ActionListener listenForButton);
		mainView.addRemoveListener(ActionListener listenForButton);
		mainView.addCourseCatalogueListener(ActionListener listenForButton);
		mainView.addQuitListener(ActionListener listenForButton);
		mainView.addStudentCourseListener(ActionListener listenForButton);
	}
	
}
