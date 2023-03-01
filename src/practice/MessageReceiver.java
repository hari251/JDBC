package practice;

import javax.jms.*;
import javax.naming.*;
import org.apache.activemq.*;

public class MessageReceiver 
{
	public static void main(String[] args) 
	{
		try
		{
			InitialContext ctx = new InitialContext();
			
			ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");

			Connection connection = cf.createConnection();
			
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			Destination destination = session.createQueue("test.prog.queue");
			
			MessageConsumer consumer = session.createConsumer(destination);
			
			consumer.setMessageListener(new MapMessageListener());
			connection.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}