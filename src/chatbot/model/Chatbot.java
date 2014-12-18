package chatbot.model;

import java.util.ArrayList;

/**
 * 
 * @author cwoo9466
 *
 */
public class Chatbot
{
	/**
	 * The programmer supplied list of memes.
	 */
	private ArrayList<String> memelist;
	/**
	 * The name of the Chatbot.
	 */
	private String name;
	/**
	 * the amount of chats that have occurred with this chatbot.
	 */
	private int chatCount;
	/**
	 * creates a Chatbot object with the supplied name and initializes the
	 * current number of chats to zero
	 * 
	 * @param name
	 *            The supplied name for the Chatbot.
	 */
	private ChatbotUser myChatbotUser;

	private ArrayList<String> userInputList;

	/**
	 * Chatbot Users
	 * 
	 * @param name
	 */

	public Chatbot(String name)
	{
		memelist = new ArrayList<String>();
		userInputList = new ArrayList<String>();
		this.name = name;
		// contentArea = "";
		chatCount = 0;
		setMyChatbotUser(new ChatbotUser());
		fillTheMemeList();
	}

	public String getName()
	{
		return name;
	}

	public int getchatCount()
	{
		return chatCount;
	}

	public void setName1(String name)
	{
		this.name = name;
	}

	private void fillTheMemeList()
	{
		memelist.add("kitties");
		memelist.add("dog");
		memelist.add("hello world");
		memelist.add("bacon");
		memelist.add("toddler fist");
		memelist.add("y u no");
	}

	/**
	 * processes input form the user against the checker methods. Returns the
	 * next output for the view
	 * 
	 * @param currentInput
	 *            The Supplied text.
	 * @return The processed text based on checker or other methods.
	 */

	public String processText(String currentInput)
	{
		String result = "";
	
		if (getChatCount() < 5)
		{
			result = introduceUser(currentInput);
		}
		else if (currentInput !=null && currentInput.length() > 0)
		{
			int randomPosition = (int) (Math.random() * 6);
			if (randomPosition== 0)
			{
				if (stringLengthChecker(currentInput))
				{
					result = "too long";
				}
				else
				{
					result = "short words";
				}
			}
			else if (randomPosition== 1)
			{

			}
			else if (randomPosition== 2)
			{
				if (memeChecker(currentInput))
				{
					result = "Wow, " + randomPosition+ " is a meme. Wahoo!";
				}
				else
				{
					result = "not a meme, try again";
				}
			}
			else if (randomPosition== 3)
			{
				// Talk about the user here :D
			}
			else if (randomPosition== 4)
			{
				// add to our list
				userInputList.add(currentInput);
			}
			else
			{
				result = "use words!!!!";
				chatCount--;
			}
			getChatCount();
			return result;
		}
	}
	
	private String introduceUser(String input)
	{
		String userQuestion = "";
		
		if (getChatCount() == 0)
			{
				myChatbotUser.setUserName(input);
				userQuestion = "good name" + myChatbotUser.getUserName() + " how old are you?";
			}

			else if (getChatCount() == 1)
			{
				int userAge = Integer.parseInt(input);
				myChatbotUser.setAge(userAge);
				userQuestion = "garsh, you are really old " +myChatbotUser.getUserName() + "how much do you weigh";
			}
			else if (getChatCount() == 2)
			{
				double userAge = Double.parseDouble(input);
				myChatbotUser.setUserName(name);
				userQuestion = "garsh, you are really old " +myChatbotUser.getUserName() + "how much do you weigh";
			}
			else if (getChatCount() ==3)
			{
				boolean userAge = Boolean.parseBoolean(input);
				myChatbotUser.setDoesTheVideoGaming(userDoesTheVideoGaming);
				userQuestion = "garsh, you are really old " +myChatbotUser.getUserName() + "how much do you weigh";
			}
			else
			{
				boolean userAge = Boolean.parseBoolean(input);
				myChatbotUser.setAge(userAge);
				userQuestion = "garsh, you are really old " +myChatbotUser.getUserName() + "how much do you weigh";
			}
		return userQuestion;
			
	}
	
	
	String randomChatConversation(String input)
	{
		String result = "";
		
		int randomPosition = (int) (Math.random() * 6);

		if (input != null);
		
		return result;
	}	
	
	private String userTopic(String userInput)
	{
		String UserBasedResponse = "";
		
		switch(randomUserTopic)
		{
		case 1:
			UserBasedResponse = myUser.doesTheVideoGames() + " is the response";
		}
	}

	public String getname()
	{
		return name;
	}

	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;
		for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if (userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		return matchesInput;
	}

	public int getChatCount()
	{
		return getChatCount();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;

		if (input.length() >= 20)
		{
			isTooLong = true;
		}

		return isTooLong;

	}

	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;

		for (String currentMeme : memelist)
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
	}

	public ChatbotUser getMyChatbotUser()
	{
		return myChatbotUser;
	}

	public void setMyChatbotUser(ChatbotUser myChatbotUser)
	{
		this.myChatbotUser = myChatbotUser;
	}

	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("yes"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}

}
