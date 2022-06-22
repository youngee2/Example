package D22;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "���ڹ�"));
		messageQueue.offer(new Message("sendKaKaoTalk", "ȫ�β�"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKaKaoTalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
	}
}

class Message {
	public String command;
	public String to;

	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}