package create.view;

import create.controller.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Color;


public class CreatePanel extends JPanel
{
	private CreateController createController;
	private SpringLayout baseLayout;
	private JTextArea createDisplay;
	private JButton buttonOne;
	private JButton buttonTwo;
	
	public CreatePanel(CreateController createController)
	{
		super();
		this.createController = createController;
		baseLayout = new SpringLayout();
		createDisplay = new JTextArea(25, 25);
		buttonOne = new JButton("");
		buttonTwo = new JButton("");
		
		setupCreateDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupCreateDisplay()
	{
		createDisplay.setEditable(false);
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(buttonOne);
		this.add(buttonTwo);
		
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, buttonTwo, 0, SpringLayout.NORTH, buttonOne);
		baseLayout.putConstraint(SpringLayout.EAST, buttonTwo, -40, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, buttonOne, 27, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, buttonOne, -39, SpringLayout.SOUTH, this);

	}
	
	private void setupListeners()
	{
		
	}
}
