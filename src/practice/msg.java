package practice;

import javax.jms.*;

import org.apache.activemq.*;


import javax.naming.*;

public class msg 
{
	public static void main(String[] args) 
	{
		Connection connection = null;
		try
		{
			Context ct = new InitialContext();
			
			ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");

			connection = cf.createConnection();
			
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			Destination destination = session.createQueue("test.message.queue");
			
			MessageProducer messageProducer = session.createProducer(destination);
						
			MapMessage message = session.createMapMessage();
			
			message.setString("Name", "Ram");
			message.setString("Role", "Developer");
			message.setDouble("Salary", 850000);
			
			messageProducer.send(message);
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if (connection != null)
			{
				try
				{
					connection.close();
				}
				catch (JMSException e)
				{
					System.out.println(e);
				}
			}
			System.exit(0);
		}
		
	
	}
}