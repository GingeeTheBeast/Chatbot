package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotAppController;
import chatbot.model.Chatbot;

public class ChatbotPlane extends JPanel
{
private ChatbotAppController baseController;
	
	private JButton firstButton;
	private JTextArea firstTextArea;
	private JTextField firstTextField;
	private SpringLayout baseLayout;


	public ChatbotPlane(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("click the button... it is so clicky :D");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		firstTextArea = new JTextArea(5, 20);
	    new JScrollPane(firstButton);
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		((JTextArea) firstTextArea).setLineWrap(true);
		((JTextArea) firstTextArea).setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.cyan);
		this.setSize(400, 400);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(firstButton);
	}

	private void setupLayout()
	{
		
	}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String currentInput = firstTextField.getText();
				String result = baseController.getChatbotDialog(currentInput);
				showTextMessage(currentInput);
				showTextMessage(result);
				firstTextField.setText("");
			}
		});
	}
	
	public void showTextMessage(String userInput)
	{
		Chatbot.append("\n" + userInput);
	}
}
