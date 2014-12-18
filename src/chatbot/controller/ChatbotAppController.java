package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPlane;
import chatbot.view.ChatbotView;

/**
 * Runs the Chatbot Project. Owns the model and associated views.
 */
public class ChatbotAppController
{
	/**
	 * The instance of the ChatbotView, the View of the application.
	 */
	private ChatbotView applicationView;
	/**
	 * The instance of the Chatbot, the Model of this application.
	 */
	private Chatbot myInsaneChatbot;
	/**
	 * The message used when starting the application.
	 */
	private String startMessage;
	/**
	 * The message provided when the user quits the application.
	 */
	private String quitMessage;
	/**
	 * Reference to the GUI JFrame object for the application.
	 */
	private ChatbotFrame appFrame;
	/**
	 * Constructor for the AppController. Initializes the Model and View components.
	 */
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		appFrame = new ChatbotFrame(this);
		myInsaneChatbot = new Chatbot("Derf");
		startMessage = "Welcom to the " + myInsaneChatbot.getName() + " chatbot.  What is your name";
		quitMessage = "goodbye cruel display port";
	}
	/**
	 * Getter method for the application Chatbot
	 */
	public void start()
	{
		((ChatbotPlane) appFrame.getContentPane()).showTextMessage(startMessage);
		
		// ChatbotPanel testPanel = (ChatbotPanel) appFrame.getContentPanel();
		// testPanel.showTestMessage(startMessage);
	}
	
	public String getChatbotDialog(String input)
	{
		String result = "";
		if(myInsaneChatbot.quitChecker(input))
		{
			quit();
		}
		
		result = myInsaneChatbot.processText(input);
		
		return result;
	}

	/**
	 * Quit method for the Chatbot application
	 */
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "good bye cruel world");
		System.exit(0);
	}
}
