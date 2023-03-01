package practice;

import javax.jms.*;

public class MapMessageListener implements MessageListener 
{
	public void onMessage(Message message)
	{
		if (message instanceof MapMessage)
		{
			MapMessage mapMessage = (MapMessage)message;
			
			try
			{
				String name = mapMessage.getString("Name");
				System.out.println("Name : " + name);
			}
			catch (JMSException e)
			{
				throw new RuntimeException(e);
			}
		}
		else
		{
			System.out.println("Invalid Message Received");
		}
	}
}