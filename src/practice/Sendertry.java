package practice;
import javax.jms.*;

public class Sendertry
{
	private static String url = "tcp://localhost:61616";
	private static String queueName = "MESSAGE_QUEUE";
	public static void main(String[] args) throws JMSException
	{
		System.out.println("url = " + url);
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue(queueName);
		MessageProducer producer = session.createProducer(destination);
		TextMessage message = session.createTextMessage("Hi team, How are you?");
		producer.send(message);
		System.out.println("Message '" + message.getText() + ", Sent Successfully to the Queue");
		connection.close();
	}
}
