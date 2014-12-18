package chatbot.view;

import chatbot.controller.ChatbotAppController;

public class ChatbotFrame<basePanel>
{
	private ChatbotPlane basePanel;
	
	public ChatbotFrame(ChatbotAppController baseController)
	{
		basePanel = new ChatbotPlane(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		setResizable(true);
	}

	private void setContentPane(ChatbotPlane basePanel2)
	{
		// TODO Auto-generated method stub
		
	}

	private void setResizable(boolean b)
	{
		// TODO Auto-generated method stub
		
	}

	private void setSize(int i, int j)
	{
		// TODO Auto-generated method stub
		
	}

	public basePanel getChatPane()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public ChatbotPlane getContentPane()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
