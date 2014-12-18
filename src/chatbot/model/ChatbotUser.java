package chatbot.model;

public class ChatbotUser
{
	//four data memebers
	//atleast tew different types (String, int, boolean, double...)
	private String userName;
	private int age;
	private boolean doesTheVideoGaming;
	private boolean hasASoul;
	
	public ChatbotUser()
	{	
		this.userName = "";
		this.age = -90;
		this.doesTheVideoGaming = false;
		this.hasASoul = false;		
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public boolean doesTheVideoGaming()
	{
		return doesTheVideoGaming;
	}
	
	public void setdoesTheVideoGaming(boolean doesTheVideoGaming)
	{
		this.doesTheVideoGaming = doesTheVideoGaming;
	}
	
	public boolean hasASoul()
	{
		return hasASoul;
	}
	
	public void sethasASoul(boolean hasASoul)
	{
		this.hasASoul = hasASoul;
	}
	
}
