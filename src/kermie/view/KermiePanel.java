package kermie.view;

import javax.swing.*;
import kermie.controller.KermieController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KermiePanel extends JPanel
{
	
	
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private KermieController baseController;
	
	public KermiePanel(KermieController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click this batton!!");
		this.infoLabel = new JLabel("Cool stuff");
		this.dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();
	
	}

	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener());
		{
			public void actionPerformed(ActionEvent selection)
			{
				infoLabel.setText(dropDown.getSelectedItem().toString());
			}
		}};
	}
}
