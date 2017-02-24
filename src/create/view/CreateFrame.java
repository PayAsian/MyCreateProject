package create.view;

import create.controller.*;
import javax.swing.JFrame;
import java.awt.Dimension;

public class CreateFrame extends JFrame
{
	private CreateController baseController;
	private CreatePanel appPanel;
	
	public CreateFrame(CreateController basecontroller)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new CreatePanel(baseController);
		
		this.setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("");
		this.setSize(new Dimension(700, 700));
		this.setVisible(true);
	}
}
